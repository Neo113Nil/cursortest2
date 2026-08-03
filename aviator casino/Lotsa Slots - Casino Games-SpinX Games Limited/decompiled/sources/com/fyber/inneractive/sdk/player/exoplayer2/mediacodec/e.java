package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4037a;
    public final boolean b;

    public e(boolean z, java.lang.String str) {
        this.f4037a = str;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e.class) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e eVar = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e) obj;
        return android.text.TextUtils.equals(this.f4037a, eVar.f4037a) && this.b == eVar.b;
    }

    public final int hashCode() {
        java.lang.String str = this.f4037a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
    }
}
