package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzi {
    public static java.security.cert.X509Certificate[][] zza(java.lang.String str) throws com.google.android.play.core.splitinstall.internal.zzf, java.lang.SecurityException, java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
        try {
            android.util.Pair zzc = com.google.android.play.core.splitinstall.internal.zzj.zzc(randomAccessFile);
            if (zzc == null) {
                long length = randomAccessFile.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb.toString());
            }
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) zzc.first;
            long longValue = ((java.lang.Long) zzc.second).longValue();
            long j = longValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new com.google.android.play.core.splitinstall.internal.zzf("ZIP64 APK not supported");
                }
            }
            long zza = com.google.android.play.core.splitinstall.internal.zzj.zza(byteBuffer);
            if (zza >= longValue) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ZIP Central Directory offset out of range: ");
                sb2.append(zza);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb2.toString());
            }
            if (com.google.android.play.core.splitinstall.internal.zzj.zzb(byteBuffer) + zza != longValue) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (zza < 32) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(zza);
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb3.toString());
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(24);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(zza - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new com.google.android.play.core.splitinstall.internal.zzf("No APK Signing Block before ZIP Central Directory");
            }
            int i = 0;
            long j2 = allocate.getLong(0);
            if (j2 < allocate.capacity() || j2 > 2147483639) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("APK Signing Block size out of range: ");
                sb4.append(j2);
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb4.toString());
            }
            int i2 = (int) (8 + j2);
            long j3 = zza - i2;
            if (j3 < 0) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("APK Signing Block offset out of range: ");
                sb5.append(j3);
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb5.toString());
            }
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i2);
            allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j3);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j4 = allocate2.getLong(0);
            if (j4 != j2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j4);
                sb6.append(" vs ");
                sb6.append(j2);
                throw new com.google.android.play.core.splitinstall.internal.zzf(sb6.toString());
            }
            android.util.Pair create = android.util.Pair.create(allocate2, java.lang.Long.valueOf(j3));
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) create.first;
            long longValue2 = ((java.lang.Long) create.second).longValue();
            if (byteBuffer2.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
                throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new java.lang.IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new java.lang.IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                java.nio.ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                while (slice.hasRemaining()) {
                    i++;
                    if (slice.remaining() < 8) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i);
                        throw new com.google.android.play.core.splitinstall.internal.zzf(sb9.toString());
                    }
                    long j5 = slice.getLong();
                    if (j5 < 4 || j5 > androidx.collection.SieveCacheKt.NodeLinkMask) {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i);
                        sb10.append(" size out of range: ");
                        sb10.append(j5);
                        throw new com.google.android.play.core.splitinstall.internal.zzf(sb10.toString());
                    }
                    int position2 = slice.position();
                    int i3 = (int) j5;
                    if (i3 > slice.remaining()) {
                        int remaining = slice.remaining();
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i);
                        sb11.append(" size out of range: ");
                        sb11.append(i3);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new com.google.android.play.core.splitinstall.internal.zzf(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        java.security.cert.X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new com.google.android.play.core.splitinstall.internal.zze(zze(slice, i3 - 4), longValue2, zza, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return zzl;
                    }
                    slice.position(position2 + i3);
                }
                throw new com.google.android.play.core.splitinstall.internal.zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                return 2;
            default:
                throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
        }
    }

    private static java.lang.String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.nio.ByteBuffer zze(java.nio.ByteBuffer byteBuffer, int i) throws java.nio.BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static java.nio.ByteBuffer zzf(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new java.io.IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zze(byteBuffer, i);
        }
        int remaining2 = byteBuffer.remaining();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new java.io.IOException(sb2.toString());
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(java.util.Map map, java.nio.channels.FileChannel fileChannel, long j, long j2, long j3, java.nio.ByteBuffer byteBuffer) throws java.lang.SecurityException {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        com.google.android.play.core.splitinstall.internal.zzc zzcVar = new com.google.android.play.core.splitinstall.internal.zzc(fileChannel, 0L, j);
        com.google.android.play.core.splitinstall.internal.zzc zzcVar2 = new com.google.android.play.core.splitinstall.internal.zzc(fileChannel, j2, j3 - j2);
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        com.google.android.play.core.splitinstall.internal.zzj.zzd(duplicate, j);
        com.google.android.play.core.splitinstall.internal.zza zzaVar = new com.google.android.play.core.splitinstall.internal.zza(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] zzk = zzk(iArr, new com.google.android.play.core.splitinstall.internal.zzb[]{zzcVar, zzcVar2, zzaVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!java.security.MessageDigest.isEqual((byte[]) map.get(java.lang.Integer.valueOf(i3)), zzk[i2])) {
                    throw new java.lang.SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.io.IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new java.io.IOException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L138;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.security.cert.CertificateFactory certificateFactory) throws java.lang.SecurityException, java.io.IOException {
        java.lang.String str;
        android.util.Pair create;
        java.nio.ByteBuffer zzf = zzf(byteBuffer);
        java.nio.ByteBuffer zzf2 = zzf(byteBuffer);
        byte[] zzi = zzi(byteBuffer);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (zzf2.hasRemaining()) {
            i2++;
            try {
                java.nio.ByteBuffer zzf3 = zzf(zzf2);
                if (zzf3.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i3 = zzf3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzi(zzf3);
                i = i3;
            } catch (java.io.IOException | java.nio.BufferUnderflowException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse signature record #");
                sb.append(i2);
                throw new java.lang.SecurityException(sb.toString(), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new java.lang.SecurityException("No signatures found");
            }
            throw new java.lang.SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    str = "RSA";
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = android.util.Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = android.util.Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = android.util.Pair.create("SHA256withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = android.util.Pair.create("SHA512withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = android.util.Pair.create("SHA256withRSA", null);
                    break;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    create = android.util.Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            create = android.util.Pair.create("SHA256withDSA", null);
        }
        java.lang.String str2 = (java.lang.String) create.first;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) create.second;
        try {
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(zzi));
            java.security.Signature signature = java.security.Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzf);
            if (!signature.verify(bArr2)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str2).concat(" signature did not verify"));
            }
            zzf.clear();
            java.nio.ByteBuffer zzf4 = zzf(zzf);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i4 = 0;
            while (zzf4.hasRemaining()) {
                i4++;
                try {
                    java.nio.ByteBuffer zzf5 = zzf(zzf4);
                    if (zzf5.remaining() < 8) {
                        throw new java.io.IOException("Record too short");
                    }
                    int i5 = zzf5.getInt();
                    arrayList2.add(java.lang.Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr = zzi(zzf5);
                    }
                } catch (java.io.IOException | java.nio.BufferUnderflowException e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to parse digest record #");
                    sb2.append(i4);
                    throw new java.io.IOException(sb2.toString(), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzc = zzc(i);
            byte[] bArr3 = (byte[]) map.put(java.lang.Integer.valueOf(zzc), bArr);
            if (bArr3 != null && !java.security.MessageDigest.isEqual(bArr3, bArr)) {
                throw new java.lang.SecurityException(zzd(zzc).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            java.nio.ByteBuffer zzf6 = zzf(zzf);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i6 = 0;
            while (zzf6.hasRemaining()) {
                i6++;
                byte[] zzi2 = zzi(zzf6);
                try {
                    arrayList3.add(new com.google.android.play.core.splitinstall.internal.zzg((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(zzi2)), zzi2));
                } catch (java.security.cert.CertificateException e3) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to decode certificate #");
                    sb3.append(i6);
                    throw new java.lang.SecurityException(sb3.toString(), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(zzi, ((java.security.cert.X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList3.toArray(new java.security.cert.X509Certificate[arrayList3.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Failed to verify ");
            sb4.append(str2);
            sb4.append(" signature");
            throw new java.lang.SecurityException(sb4.toString(), e4);
        }
    }

    private static byte[][] zzk(int[] iArr, com.google.android.play.core.splitinstall.internal.zzb[] zzbVarArr) throws java.security.DigestException {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            j = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
            if (i2 >= 3) {
                break;
            }
            j3 += (zzbVarArr[i2].zza() + 1048575) / com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
            i2++;
        }
        if (j3 >= 2097151) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many chunks: ");
            sb.append(j3);
            throw new java.security.DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) j3;
            byte[] bArr2 = new byte[(zzb(iArr[i3]) * i4) + 5];
            bArr2[0] = com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME;
            zzg(i4, bArr2, 1);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            java.lang.String zzd = zzd(iArr[i5]);
            try {
                messageDigestArr[i5] = java.security.MessageDigest.getInstance(zzd);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(zzd.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            com.google.android.play.core.splitinstall.internal.zzb zzbVar = zzbVarArr[i6];
            long j4 = j2;
            int i9 = i8;
            long zza = zzbVar.zza();
            while (zza > j2) {
                int min = (int) java.lang.Math.min(zza, j);
                zzg(min, bArr3, 1);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzbVar.zzb(messageDigestArr, j5, min);
                    com.google.android.play.core.splitinstall.internal.zzb zzbVar2 = zzbVar;
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i11];
                        int zzb = zzb(i12);
                        int i13 = length;
                        java.security.MessageDigest messageDigest = messageDigestArr[i11];
                        java.security.MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i9 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            java.lang.String algorithm = messageDigest.getAlgorithm();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new java.lang.RuntimeException(sb2.toString());
                        }
                        i11++;
                        bArr3 = bArr4;
                        length = i13;
                        messageDigestArr = messageDigestArr2;
                    }
                    byte[] bArr6 = bArr3;
                    long j6 = min;
                    long j7 = j5 + j6;
                    zza -= j6;
                    i9++;
                    zzbVar = zzbVar2;
                    j2 = 0;
                    j = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
                    bArr3 = bArr6;
                    j4 = j7;
                    messageDigestArr = messageDigestArr;
                } catch (java.io.IOException e2) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to digest chunk #");
                    sb3.append(i9);
                    sb3.append(" of section #");
                    sb3.append(i7);
                    throw new java.security.DigestException(sb3.toString(), e2);
                }
            }
            i7++;
            i6++;
            j2 = 0;
            j = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
            i8 = i9;
        }
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr8 = bArr[i14];
            java.lang.String zzd2 = zzd(i15);
            try {
                bArr7[i14] = java.security.MessageDigest.getInstance(zzd2).digest(bArr8);
            } catch (java.security.NoSuchAlgorithmException e3) {
                throw new java.lang.RuntimeException(zzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr7;
    }

    private static java.security.cert.X509Certificate[][] zzl(java.nio.channels.FileChannel fileChannel, com.google.android.play.core.splitinstall.internal.zze zzeVar) throws java.lang.SecurityException {
        java.nio.ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        java.nio.ByteBuffer byteBuffer2;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zza;
                java.nio.ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new java.lang.SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new java.lang.SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new java.lang.SecurityException("No content digests found");
                }
                j = zzeVar.zzb;
                j2 = zzeVar.zzc;
                j3 = zzeVar.zzd;
                byteBuffer2 = zzeVar.zze;
                zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e2) {
                throw new java.lang.SecurityException("Failed to read list of signers", e2);
            }
        } catch (java.security.cert.CertificateException e3) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
