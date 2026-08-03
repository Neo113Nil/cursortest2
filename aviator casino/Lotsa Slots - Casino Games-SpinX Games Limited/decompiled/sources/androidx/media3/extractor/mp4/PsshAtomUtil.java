package androidx.media3.extractor.mp4;

/* loaded from: classes2.dex */
public final class PsshAtomUtil {
    private static final java.lang.String TAG = "PsshAtomUtil";

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, java.util.UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (java.util.UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    public static java.util.UUID parseUuid(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        return parsePsshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return -1;
        }
        return parsePsshAtom.version;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, java.util.UUID uuid) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        if (!uuid.equals(parsePsshAtom.uuid)) {
            androidx.media3.common.util.Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + parsePsshAtom.uuid + ".");
            return null;
        }
        return parsePsshAtom.schemeData;
    }

    public static androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom(byte[] bArr) {
        java.util.UUID[] uuidArr;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        int bytesLeft = parsableByteArray.bytesLeft();
        int readInt = parsableByteArray.readInt();
        if (readInt != bytesLeft) {
            androidx.media3.common.util.Log.w(TAG, "Advertised atom size (" + readInt + ") does not match buffer size: " + bytesLeft);
            return null;
        }
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 != 1886614376) {
            androidx.media3.common.util.Log.w(TAG, "Atom type is not pssh: " + readInt2);
            return null;
        }
        int parseFullAtomVersion = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion > 1) {
            androidx.media3.common.util.Log.w(TAG, "Unsupported pssh version: " + parseFullAtomVersion);
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (parseFullAtomVersion == 1) {
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            uuidArr = new java.util.UUID[readUnsignedIntToInt];
            for (int i = 0; i < readUnsignedIntToInt; i++) {
                uuidArr[i] = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
            }
        } else {
            uuidArr = null;
        }
        int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        int bytesLeft2 = parsableByteArray.bytesLeft();
        if (readUnsignedIntToInt2 != bytesLeft2) {
            androidx.media3.common.util.Log.w(TAG, "Atom data size (" + readUnsignedIntToInt2 + ") does not match the bytes left: " + bytesLeft2);
            return null;
        }
        byte[] bArr2 = new byte[readUnsignedIntToInt2];
        parsableByteArray.readBytes(bArr2, 0, readUnsignedIntToInt2);
        return new androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom(uuid, parseFullAtomVersion, bArr2, uuidArr);
    }

    public static final class PsshAtom {
        public final java.util.UUID[] keyIds;
        public final byte[] schemeData;
        public final java.util.UUID uuid;
        public final int version;

        PsshAtom(java.util.UUID uuid, int i, byte[] bArr, java.util.UUID[] uuidArr) {
            this.uuid = uuid;
            this.version = i;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }
}
