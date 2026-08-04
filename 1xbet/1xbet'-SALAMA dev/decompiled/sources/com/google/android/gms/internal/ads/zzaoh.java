package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzaoh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v32 */
    public static X509Certificate[][] zza(String str) throws Throwable {
        ?? r7;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzaoi.zzc(randomAccessFile);
            try {
                if (pairZzc == null) {
                    throw new zzaod("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
                long jLongValue = ((Long) pairZzc.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaod("ZIP64 APK not supported");
                    }
                }
                long jZza = zzaoi.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzaod("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (jZza + zzaoi.zzb(byteBuffer) != jLongValue) {
                    throw new zzaod("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzaod("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                long j3 = jLongValue;
                randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
                randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaod("No APK Signing Block before ZIP Central Directory");
                }
                long j7 = byteBufferAllocate.getLong(0);
                if (j7 < byteBufferAllocate.capacity() || j7 > 2147483639) {
                    throw new zzaod("APK Signing Block size out of range: " + j7);
                }
                int i7 = (int) (8 + j7);
                long j8 = jZza - ((long) i7);
                ?? r8 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                try {
                    if (r8 < 0) {
                        throw new zzaod("APK Signing Block offset out of range: " + j8);
                    }
                    try {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i7);
                        byteBufferAllocate2.order(byteOrder);
                        r8 = randomAccessFile;
                        r8.seek(j8);
                        r8.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                        long j9 = jZza;
                        long j10 = byteBufferAllocate2.getLong(0);
                        if (j10 != j7) {
                            throw new zzaod("APK Signing Block sizes in header and footer do not match: " + j10 + " vs " + j7);
                        }
                        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j8));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                        long jLongValue2 = ((Long) pairCreate.second).longValue();
                        if (byteBuffer2.order() != byteOrder) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int iCapacity = byteBuffer2.capacity() - 24;
                        if (iCapacity < 8) {
                            throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                        }
                        int iCapacity2 = byteBuffer2.capacity();
                        if (iCapacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                        }
                        int iLimit = byteBuffer2.limit();
                        int iPosition = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iCapacity);
                            byteBuffer2.position(8);
                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                            byteBufferSlice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            int i8 = 0;
                            while (byteBufferSlice.hasRemaining()) {
                                i8++;
                                if (byteBufferSlice.remaining() < 8) {
                                    throw new zzaod("Insufficient data to read size of APK Signing Block entry #" + i8);
                                }
                                long j11 = byteBufferSlice.getLong();
                                if (j11 < 4 || j11 > 2147483647L) {
                                    throw new zzaod("APK Signing Block entry #" + i8 + " size out of range: " + j11);
                                }
                                int i9 = (int) j11;
                                int iPosition2 = byteBufferSlice.position() + i9;
                                if (i9 > byteBufferSlice.remaining()) {
                                    throw new zzaod("APK Signing Block entry #" + i8 + " size out of range: " + i9 + ", available: " + byteBufferSlice.remaining());
                                }
                                if (byteBufferSlice.getInt() == 1896449818) {
                                    X509Certificate[][] x509CertificateArrZzl = zzl(r8.getChannel(), new zzaoc(zze(byteBufferSlice, i9 - 4), jLongValue2, j9, j3, byteBuffer, null));
                                    r8.close();
                                    try {
                                        r8.close();
                                    } catch (IOException unused) {
                                    }
                                    return x509CertificateArrZzl;
                                }
                                long j12 = j3;
                                long j13 = j9;
                                byteBufferSlice.position(iPosition2);
                                j9 = j13;
                                j3 = j12;
                            }
                            throw new zzaod("No APK Signature Scheme v2 block in APK Signing Block");
                        } catch (Throwable th) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r8 = randomAccessFile;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                r7 = r8;
            } catch (Throwable th4) {
                th = th4;
                r7 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            r7 = randomAccessFile;
        }
        try {
            r7.close();
        } catch (IOException unused2) {
        }
        throw th;
    }

    private static int zzb(int i7) {
        if (i7 == 1) {
            return 32;
        }
        if (i7 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(k.d(i7, "Unknown content digest algorthm: "));
    }

    private static int zzc(int i7) {
        if (i7 == 513) {
            return 1;
        }
        if (i7 == 514) {
            return 2;
        }
        if (i7 == 769) {
            return 1;
        }
        switch (i7) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
        }
    }

    private static String zzd(int i7) {
        if (i7 == 1) {
            return "SHA-256";
        }
        if (i7 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(k.d(i7, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i7) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i8 = i7 + iPosition;
        if (i8 < iPosition || i8 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i8);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i8);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(k.d(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i7);
        }
        throw new IOException(AbstractC0486a1.e(i7, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    private static void zzg(int i7, byte[] bArr, int i8) {
        bArr[1] = (byte) (i7 & 255);
        bArr[2] = (byte) ((i7 >>> 8) & 255);
        bArr[3] = (byte) ((i7 >>> 16) & 255);
        bArr[4] = (byte) (i7 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j3, long j7, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaob zzaobVar = new zzaob(fileChannel, 0L, j);
        zzaob zzaobVar2 = new zzaob(fileChannel, j3, j7 - j3);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaoi.zzd(byteBufferDuplicate, j);
        zzanz zzanzVar = new zzanz(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Integer) it.next()).intValue();
            i7++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzaoa[]{zzaobVar, zzaobVar2, zzanzVar});
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = iArr[i8];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i9)), bArrZzk[i8])) {
                    throw new SecurityException(zzd(i9).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e7) {
            throw new SecurityException("Failed to compute digest(s) of contents", e7);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IOException("Negative length");
        }
        if (i7 > byteBuffer.remaining()) {
            throw new IOException(AbstractC0486a1.e(i7, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i7];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i7 = -1;
        int i8 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i8++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i9 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i9));
                if (i9 != 513 && i9 != 514 && i9 != 769) {
                    switch (i9) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i7 != -1) {
                    int iZzc = zzc(i9);
                    int iZzc2 = zzc(i7);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i7 = i9;
            } catch (IOException e7) {
                e = e7;
                throw new SecurityException(k.d(i8, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e8) {
                e = e8;
                throw new SecurityException(k.d(i8, "Failed to parse signature record #"), e);
            }
        }
        if (i7 == -1) {
            if (i8 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i7 == 513 || i7 == 514) {
            str = "EC";
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            str = "DSA";
        }
        if (i7 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i7 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i7) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e9) {
                    e = e9;
                    throw new IOException(k.d(i10, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e10) {
                    e = e10;
                    throw new IOException(k.d(i10, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i7);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i12++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzaoe((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e11) {
                    throw new SecurityException(k.d(i12, "Failed to decode certificate #"), e11);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e12) {
            e = e12;
            throw new SecurityException(AbstractC0486a1.h("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e13) {
            e = e13;
            throw new SecurityException(AbstractC0486a1.h("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            throw new SecurityException(AbstractC0486a1.h("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e15) {
            e = e15;
            throw new SecurityException(AbstractC0486a1.h("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e16) {
            e = e16;
            throw new SecurityException(AbstractC0486a1.h("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzaoa[] zzaoaVarArr) throws DigestException {
        long j;
        int i7;
        int length;
        int i8 = 0;
        long j3 = 0;
        int i9 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            if (i9 >= 3) {
                break;
            }
            jZza += (zzaoaVarArr[i9].zza() + 1048575) / 1048576;
            i9++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(AbstractC0486a1.g("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i10 = 0;
        while (true) {
            length = iArr.length;
            if (i10 >= length) {
                break;
            }
            int i11 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i10]) * i11) + 5];
            bArr2[0] = 90;
            zzg(i11, bArr2, 1);
            bArr[i10] = bArr2;
            i10++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String strZzd = zzd(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(strZzd);
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e7);
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (i7 = 3; i13 < i7; i7 = 3) {
            zzaoa zzaoaVar = zzaoaVarArr[i13];
            long j7 = j3;
            long jZza2 = zzaoaVar.zza();
            while (jZza2 > j3) {
                int iMin = (int) Math.min(jZza2, j);
                zzg(iMin, bArr3, 1);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                long j8 = j7;
                try {
                    zzaoaVar.zzb(messageDigestArr, j8, iMin);
                    byte[] bArr4 = bArr3;
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        zzaoa zzaoaVar2 = zzaoaVar;
                        byte[] bArr5 = bArr[i16];
                        int iZzb = zzb(i17);
                        int i18 = length;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i14 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i16++;
                        zzaoaVar = zzaoaVar2;
                        length = i18;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j9 = iMin;
                    long j10 = j8 + j9;
                    jZza2 -= j9;
                    i14++;
                    j3 = 0;
                    j = 1048576;
                    bArr3 = bArr4;
                    j7 = j10;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e8) {
                    throw new DigestException(AbstractC0486a1.e(i14, i8, "Failed to digest chunk #", " of section #"), e8);
                }
            }
            i8++;
            i13++;
            j3 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr7 = bArr[i19];
            String strZzd2 = zzd(i20);
            try {
                bArr6[i19] = MessageDigest.getInstance(strZzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(strZzd2.concat(" digest not supported"), e9);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaoc zzaocVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzaocVar.zza);
                int i7 = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i7++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e7) {
                        throw new SecurityException(AbstractC0486a1.f(i7, "Failed to parse/verify signer #", " block"), e7);
                    }
                }
                if (i7 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzaocVar.zzb, zzaocVar.zzc, zzaocVar.zzd, zzaocVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }
}
