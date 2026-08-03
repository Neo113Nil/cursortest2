package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f4103a;
    public final java.io.File b;

    public c(java.io.File file) {
        this.f4103a = file;
        this.b = new java.io.File(file.getPath() + ".bak");
    }

    public final java.io.FileInputStream a() {
        if (this.b.exists()) {
            this.f4103a.delete();
            this.b.renameTo(this.f4103a);
        }
        return new java.io.FileInputStream(this.f4103a);
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.util.b b() {
        if (this.f4103a.exists()) {
            if (this.b.exists()) {
                this.f4103a.delete();
            } else if (!this.f4103a.renameTo(this.b)) {
                android.util.Log.w("AtomicFile", "Couldn't rename file " + this.f4103a + " to backup file " + this.b);
            }
        }
        try {
            return new com.fyber.inneractive.sdk.player.exoplayer2.util.b(this.f4103a);
        } catch (java.io.FileNotFoundException unused) {
            if (!this.f4103a.getParentFile().mkdirs()) {
                throw new java.io.IOException("Couldn't create directory " + this.f4103a);
            }
            try {
                return new com.fyber.inneractive.sdk.player.exoplayer2.util.b(this.f4103a);
            } catch (java.io.FileNotFoundException unused2) {
                throw new java.io.IOException("Couldn't create " + this.f4103a);
            }
        }
    }
}
