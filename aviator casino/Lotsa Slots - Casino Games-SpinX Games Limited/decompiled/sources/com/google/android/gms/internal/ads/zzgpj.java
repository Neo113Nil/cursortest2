package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgpj implements com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgfd {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgqh zzb;
    private final com.google.android.gms.internal.ads.zzgdf zzc;
    private final com.google.android.gms.internal.ads.zzhcg zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.common.util.concurrent.ListenableFuture zzf = com.google.android.gms.internal.ads.zzhbw.zza(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);

    zzgpj(android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = context;
        this.zzb = zzgqhVar;
        this.zzc = zzgdfVar;
        this.zzd = zzhcgVar;
    }

    private final void zzh(java.util.Map map) {
        synchronized (this) {
            map.put("ai", this.zzf);
        }
    }

    private static java.lang.String zzi(android.content.Context context) {
        java.io.File file = new java.io.File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA256");
                for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, read);
                }
                com.google.android.gms.internal.ads.zzgzh zzi = com.google.android.gms.internal.ads.zzgzh.zzn().zzi();
                byte[] digest = messageDigest.digest();
                java.lang.String zzj = zzi.zzj(digest, 0, digest.length);
                fileInputStream.close();
                return zzj;
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException | java.lang.UnsupportedOperationException | java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static java.lang.String zzj(java.lang.String... strArr) {
        for (int i = 0; i < 2; i++) {
            java.lang.String str = strArr[i];
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object zzk(android.content.Context context, com.google.android.gms.internal.ads.zzgdf zzgdfVar, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            completer.set("");
            return "";
        }
        try {
            java.lang.String packageName = context.getPackageName();
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzk = com.google.android.gms.internal.ads.zzgzh.zzn().zzi().zzk(zzj(zzgdfVar.zzo(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(zzk)));
            if (!android.os.Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(com.google.android.gms.internal.ads.zzgzh.zzn().zzi().zzk(zzj(zzgdfVar.zzp(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b")))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new android.content.pm.PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzgpg
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final /* synthetic */ void onChecksumsReady(java.util.List list) {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this;
                    if (list == null) {
                        completer2.set("");
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            android.content.pm.ApkChecksum apkChecksum = (android.content.pm.ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                com.google.android.gms.internal.ads.zzgzh zzi = com.google.android.gms.internal.ads.zzgzh.zzn().zzi();
                                byte[] value = apkChecksum.getValue();
                                completer2.set(zzi.zzj(value, 0, value.length));
                                return;
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    completer2.set("");
                }
            });
            return "";
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NoClassDefFoundError | java.security.cert.CertificateException unused) {
            completer.set("");
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zze.getAndSet(true) ? com.google.android.gms.internal.ads.zzhbw.zzb() : this.zzd.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgpi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgpj.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
        zzh(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        zzh(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
        zzh(map);
    }

    final /* synthetic */ java.lang.String zze() {
        com.google.android.gms.internal.ads.zzgta zzgtaVar = new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgph
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgpj.this.zzg((java.lang.String) obj);
            }
        };
        synchronized (this) {
            com.google.android.gms.internal.ads.zzgqh zzgqhVar = this.zzb;
            final android.content.Context context = this.zza;
            final com.google.android.gms.internal.ads.zzgdf zzgdfVar = this.zzc;
            com.google.common.util.concurrent.ListenableFuture zzk = com.google.android.gms.internal.ads.zzhbw.zzk(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: com.google.android.gms.internal.ads.zzgpf
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final /* synthetic */ java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    java.lang.Object zzk2;
                    zzk2 = com.google.android.gms.internal.ads.zzgpj.zzk(context, zzgdfVar, completer);
                    return zzk2;
                }
            }), zzgtaVar, this.zzd);
            zzgqhVar.zze(52, zzk);
            this.zzf = zzk;
        }
        return "";
    }

    final /* synthetic */ java.lang.String zzg(java.lang.String str) {
        return com.google.android.gms.internal.ads.zzgua.zzc(str) ? zzi(this.zza) : str;
    }
}
