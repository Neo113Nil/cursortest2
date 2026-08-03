package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzil extends com.google.android.gms.internal.ads.zzhh {
    private final android.content.Context zza;
    private com.google.android.gms.internal.ads.zzht zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzil(android.content.Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 15);
        sb.append("rawresource:///");
        sb.append(i);
        return android.net.Uri.parse(sb.toString());
    }

    private static android.content.res.AssetFileDescriptor zzk(android.content.Context context, com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzik {
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri normalizeScheme = zzhtVar.zza.normalizeScheme();
        if (android.text.TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 61);
                sb.append("rawresource:// URI must have exactly one path element, found ");
                sb.append(size);
                throw new com.google.android.gms.internal.ads.zzik(sb.toString());
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!android.text.TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                java.lang.String scheme = normalizeScheme.getScheme();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(scheme).length() + 62);
                sb2.append("Unsupported URI scheme (");
                sb2.append(scheme);
                sb2.append("). Only android.resource is supported.");
                throw new com.google.android.gms.internal.ads.zzik(sb2.toString(), null, 1004);
            }
            java.lang.String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            java.lang.String packageName = android.text.TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new com.google.android.gms.internal.ads.zzik("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 1 + java.lang.String.valueOf(path).length());
                sb3.append(packageName);
                sb3.append(":");
                sb3.append(path);
                identifier = resourcesForApplication.getIdentifier(sb3.toString(), "raw", null);
                if (identifier == 0) {
                    throw new com.google.android.gms.internal.ads.zzik("Resource not found.", null, 2005);
                }
            }
        }
        try {
            android.content.res.AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            java.lang.String valueOf = java.lang.String.valueOf(normalizeScheme);
            java.lang.String.valueOf(valueOf);
            throw new com.google.android.gms.internal.ads.zzik("Resource is compressed: ".concat(java.lang.String.valueOf(valueOf)), null, 2000);
        } catch (android.content.res.Resources.NotFoundException e2) {
            throw new com.google.android.gms.internal.ads.zzik(null, e2, 2005);
        }
    }

    private static int zzl(java.lang.String str) throws com.google.android.gms.internal.ads.zzik {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new com.google.android.gms.internal.ads.zzik("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzik {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzik(null, e, 2000);
            }
        }
        java.io.InputStream inputStream = this.zzd;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.io.InputStream inputStream2 = inputStream;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new com.google.android.gms.internal.ads.zzik("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzik {
        long j;
        this.zzb = zzhtVar;
        zzf(zzhtVar);
        android.content.res.AssetFileDescriptor zzk = zzk(this.zza, zzhtVar);
        this.zzc = zzk;
        long length = zzk.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhtVar.zze > length) {
                    throw new com.google.android.gms.internal.ads.zzik(null, null, 2008);
                }
            } catch (com.google.android.gms.internal.ads.zzik e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new com.google.android.gms.internal.ads.zzik(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j2 = zzhtVar.zze;
        long skip = fileInputStream.skip(startOffset + j2) - startOffset;
        if (skip != j2) {
            throw new com.google.android.gms.internal.ads.zzik(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new com.google.android.gms.internal.ads.zzik(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new com.google.android.gms.internal.ads.zzhq(2008);
            }
        }
        long j3 = zzhtVar.zzf;
        if (j3 != -1) {
            this.zze = j == -1 ? j3 : java.lang.Math.min(j, j3);
        }
        this.zzf = true;
        zzg(zzhtVar);
        return j3 != -1 ? j3 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzht zzhtVar = this.zzb;
        if (zzhtVar != null) {
            return zzhtVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzik {
        this.zzb = null;
        try {
            try {
                try {
                    java.io.InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (java.io.IOException e) {
                        throw new com.google.android.gms.internal.ads.zzik(null, e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new com.google.android.gms.internal.ads.zzik(null, e2, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.zzd = null;
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th2;
            } catch (java.io.IOException e3) {
                throw new com.google.android.gms.internal.ads.zzik(null, e3, 2000);
            }
        }
    }
}
