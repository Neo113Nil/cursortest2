package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzask {
    public static java.security.cert.X509Certificate[][] zza(java.lang.String str) throws com.google.android.gms.internal.ads.zzash, java.lang.SecurityException, java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        try {
            android.util.Pair zza = com.google.android.gms.internal.ads.zzasl.zza(randomAccessFile);
            if (zza == null) {
                long length = randomAccessFile.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new com.google.android.gms.internal.ads.zzash(sb.toString());
            }
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) zza.first;
            long longValue = ((java.lang.Long) zza.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new com.google.android.gms.internal.ads.zzash("ZIP64 APK not supported");
                }
            }
            long zzb = com.google.android.gms.internal.ads.zzasl.zzb(byteBuffer);
            if (zzb >= longValue) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 82 + java.lang.String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(zzb);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new com.google.android.gms.internal.ads.zzash(sb2.toString());
            }
            if (com.google.android.gms.internal.ads.zzasl.zzd(byteBuffer) + zzb != longValue) {
                throw new com.google.android.gms.internal.ads.zzash("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (zzb < 32) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(zzb);
                throw new com.google.android.gms.internal.ads.zzash(sb3.toString());
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(24);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(zzb - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new com.google.android.gms.internal.ads.zzash("No APK Signing Block before ZIP Central Directory");
            }
            long j2 = allocate.getLong(0);
            if (j2 < allocate.capacity() || j2 > 2147483639) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(j2).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j2);
                throw new com.google.android.gms.internal.ads.zzash(sb4.toString());
            }
            int i = (int) (8 + j2);
            long j3 = zzb - i;
            if (j3 < 0) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(j3).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j3);
                throw new com.google.android.gms.internal.ads.zzash(sb5.toString());
            }
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i);
            allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j3);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j4 = allocate2.getLong(0);
            if (j4 != j2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(j4).length() + 63 + java.lang.String.valueOf(j2).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j4);
                sb6.append(" vs ");
                sb6.append(j2);
                throw new com.google.android.gms.internal.ads.zzash(sb6.toString());
            }
            android.util.Pair create = android.util.Pair.create(allocate2, java.lang.Long.valueOf(j3));
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) create.first;
            long longValue2 = ((java.lang.Long) create.second).longValue();
            if (byteBuffer2.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
                throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new java.lang.IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(capacity).length() + 19 + java.lang.String.valueOf(capacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new java.lang.IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            java.lang.String str2 = "Insufficient data to read size of APK Signing Block entry #";
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                java.nio.ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i2 = 0;
                while (slice.hasRemaining()) {
                    int i3 = i2 + 1;
                    if (slice.remaining() < 8) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 59);
                        sb9.append(str2);
                        sb9.append(i3);
                        throw new com.google.android.gms.internal.ads.zzash(sb9.toString());
                    }
                    long j5 = slice.getLong();
                    if (j5 < 4 || j5 > 2147483647L) {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 45 + java.lang.String.valueOf(j5).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i3);
                        sb10.append(" size out of range: ");
                        sb10.append(j5);
                        throw new com.google.android.gms.internal.ads.zzash(sb10.toString());
                    }
                    int i4 = (int) j5;
                    int position2 = slice.position() + i4;
                    if (i4 > slice.remaining()) {
                        int remaining = slice.remaining();
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 45 + java.lang.String.valueOf(i4).length() + 13 + java.lang.String.valueOf(remaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i3);
                        sb11.append(" size out of range: ");
                        sb11.append(i4);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new com.google.android.gms.internal.ads.zzash(sb11.toString());
                    }
                    java.lang.String str3 = str2;
                    if (slice.getInt() == 1896449818) {
                        java.security.cert.X509Certificate[][] zzb2 = zzb(randomAccessFile.getChannel(), new com.google.android.gms.internal.ads.zzasg(zzi(slice, i4 - 4), longValue2, zzb, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return zzb2;
                    }
                    slice.position(position2);
                    i2 = i3;
                    str2 = str3;
                }
                throw new com.google.android.gms.internal.ads.zzash("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (java.lang.Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static java.security.cert.X509Certificate[][] zzb(java.nio.channels.FileChannel fileChannel, com.google.android.gms.internal.ads.zzasg zzasgVar) throws java.lang.SecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                java.nio.ByteBuffer zzj = zzj(zzasgVar.zza());
                int i = 0;
                while (zzj.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzc(zzj(zzj), hashMap, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 37);
                        sb.append("Failed to parse/verify signer #");
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
                zzd(hashMap, fileChannel, zzasgVar.zzb(), zzasgVar.zzc(), zzasgVar.zzd(), zzasgVar.zze());
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e2) {
                throw new java.lang.SecurityException("Failed to read list of signers", e2);
            }
        } catch (java.security.cert.CertificateException e3) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzf(r6);
        r12 = zzf(r7);
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
    private static java.security.cert.X509Certificate[] zzc(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.security.cert.CertificateFactory certificateFactory) throws java.lang.SecurityException, java.io.IOException {
        java.lang.String str;
        android.util.Pair create;
        java.nio.ByteBuffer zzj = zzj(byteBuffer);
        java.nio.ByteBuffer zzj2 = zzj(byteBuffer);
        byte[] zzk = zzk(byteBuffer);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (zzj2.hasRemaining()) {
            i2++;
            try {
                java.nio.ByteBuffer zzj3 = zzj(zzj2);
                if (zzj3.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i3 = zzj3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzk(zzj3);
                i = i3;
            } catch (java.io.IOException | java.nio.BufferUnderflowException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 34);
                sb.append("Failed to parse signature record #");
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
                case 260:
                    str = "RSA";
                    break;
                default:
                    java.lang.String hexString = java.lang.Long.toHexString(i);
                    java.lang.String.valueOf(hexString);
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(hexString)));
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
                    create = android.util.Pair.create(com.facebook.internal.security.OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256, null);
                    break;
                case 260:
                    create = android.util.Pair.create("SHA512withRSA", null);
                    break;
                default:
                    java.lang.String hexString2 = java.lang.Long.toHexString(i);
                    java.lang.String.valueOf(hexString2);
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(hexString2)));
            }
        } else {
            create = android.util.Pair.create("SHA256withDSA", null);
        }
        java.lang.String str2 = (java.lang.String) create.first;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) create.second;
        try {
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(zzk));
            java.security.Signature signature = java.security.Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzj);
            if (!signature.verify(bArr2)) {
                java.lang.String.valueOf(str2);
                throw new java.lang.SecurityException(java.lang.String.valueOf(str2).concat(" signature did not verify"));
            }
            zzj.clear();
            java.nio.ByteBuffer zzj4 = zzj(zzj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i4 = 0;
            while (zzj4.hasRemaining()) {
                i4++;
                try {
                    java.nio.ByteBuffer zzj5 = zzj(zzj4);
                    if (zzj5.remaining() < 8) {
                        throw new java.io.IOException("Record too short");
                    }
                    int i5 = zzj5.getInt();
                    arrayList2.add(java.lang.Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr = zzk(zzj5);
                    }
                } catch (java.io.IOException | java.nio.BufferUnderflowException e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 31);
                    sb2.append("Failed to parse digest record #");
                    sb2.append(i4);
                    throw new java.io.IOException(sb2.toString(), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzf = zzf(i);
            byte[] bArr3 = (byte[]) map.put(java.lang.Integer.valueOf(zzf), bArr);
            if (bArr3 != null && !java.security.MessageDigest.isEqual(bArr3, bArr)) {
                throw new java.lang.SecurityException(zzg(zzf).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            java.nio.ByteBuffer zzj6 = zzj(zzj);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i6 = 0;
            while (zzj6.hasRemaining()) {
                i6++;
                byte[] zzk2 = zzk(zzj6);
                try {
                    arrayList3.add(new com.google.android.gms.internal.ads.zzasi((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(zzk2)), zzk2));
                } catch (java.security.cert.CertificateException e3) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i6).length() + 30);
                    sb3.append("Failed to decode certificate #");
                    sb3.append(i6);
                    throw new java.lang.SecurityException(sb3.toString(), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(zzk, ((java.security.cert.X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList3.toArray(new java.security.cert.X509Certificate[arrayList3.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str2);
            sb4.append(" signature");
            throw new java.lang.SecurityException(sb4.toString(), e4);
        }
    }

    private static void zzd(java.util.Map map, java.nio.channels.FileChannel fileChannel, long j, long j2, long j3, java.nio.ByteBuffer byteBuffer) throws java.lang.SecurityException {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        com.google.android.gms.internal.ads.zzasf zzasfVar = new com.google.android.gms.internal.ads.zzasf(fileChannel, 0L, j);
        com.google.android.gms.internal.ads.zzasf zzasfVar2 = new com.google.android.gms.internal.ads.zzasf(fileChannel, j2, j3 - j2);
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        com.google.android.gms.internal.ads.zzasl.zzc(duplicate, j);
        com.google.android.gms.internal.ads.zzasd zzasdVar = new com.google.android.gms.internal.ads.zzasd(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] zze = zze(iArr, new com.google.android.gms.internal.ads.zzase[]{zzasfVar, zzasfVar2, zzasdVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!java.security.MessageDigest.isEqual((byte[]) map.get(java.lang.Integer.valueOf(i3)), zze[i2])) {
                    throw new java.lang.SecurityException(zzg(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] zze(int[] iArr, com.google.android.gms.internal.ads.zzase[] zzaseVarArr) throws java.security.DigestException {
        long j;
        int i;
        int length;
        int i2;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzaseVarArr[i3].zza() + 1048575) / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i3++;
        }
        if (j3 >= 2097151) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j3).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new java.security.DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) j3;
            byte[] bArr2 = new byte[(zzh(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzl(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            java.lang.String zzg = zzg(iArr[i6]);
            try {
                messageDigestArr[i6] = java.security.MessageDigest.getInstance(zzg);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(zzg.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i) {
            com.google.android.gms.internal.ads.zzase zzaseVar = zzaseVarArr[i7];
            long j4 = j2;
            int i10 = i7;
            long zza = zzaseVar.zza();
            while (zza > j2) {
                int min = (int) java.lang.Math.min(zza, j);
                zzl(min, bArr3, i2);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzaseVar.zzb(messageDigestArr, j5, min);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int zzh = zzh(i13);
                        com.google.android.gms.internal.ads.zzase zzaseVar2 = zzaseVar;
                        java.security.MessageDigest messageDigest = messageDigestArr[i12];
                        byte[] bArr5 = bArr3;
                        int digest = messageDigest.digest(bArr4, (i8 * zzh) + 5, zzh);
                        if (digest != zzh) {
                            java.lang.String algorithm = messageDigest.getAlgorithm();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(algorithm).length() + 35 + java.lang.String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new java.lang.RuntimeException(sb2.toString());
                        }
                        i12++;
                        zzaseVar = zzaseVar2;
                        bArr3 = bArr5;
                    }
                    com.google.android.gms.internal.ads.zzase zzaseVar3 = zzaseVar;
                    long j6 = min;
                    zza -= j6;
                    i8++;
                    j4 = j5 + j6;
                    zzaseVar = zzaseVar3;
                    j2 = 0;
                    j = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    i2 = 1;
                } catch (java.io.IOException e2) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i8).length() + 37 + java.lang.String.valueOf(i9).length());
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i8);
                    sb3.append(" of section #");
                    sb3.append(i9);
                    throw new java.security.DigestException(sb3.toString(), e2);
                }
            }
            i9++;
            i7 = i10 + 1;
            j2 = 0;
            j = android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i = 3;
            i2 = 1;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            java.lang.String zzg2 = zzg(i15);
            try {
                bArr6[i14] = java.security.MessageDigest.getInstance(zzg2).digest(bArr7);
            } catch (java.security.NoSuchAlgorithmException e3) {
                throw new java.lang.RuntimeException(zzg2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static int zzf(int i) {
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
            case 260:
                return 2;
            default:
                java.lang.String hexString = java.lang.Long.toHexString(i);
                java.lang.String.valueOf(hexString);
                throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(hexString)));
        }
    }

    private static java.lang.String zzg(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static int zzh(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.nio.ByteBuffer zzi(java.nio.ByteBuffer byteBuffer, int i) throws java.nio.BufferUnderflowException {
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

    private static java.nio.ByteBuffer zzj(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(remaining).length() + 82);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new java.io.IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i);
        }
        int remaining2 = byteBuffer.remaining();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 79 + java.lang.String.valueOf(remaining2).length());
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new java.io.IOException(sb2.toString());
    }

    private static byte[] zzk(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 68 + java.lang.String.valueOf(remaining).length());
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new java.io.IOException(sb.toString());
    }

    private static void zzl(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
