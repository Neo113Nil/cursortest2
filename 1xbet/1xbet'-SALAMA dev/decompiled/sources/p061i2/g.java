package p061i2;

import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f13875C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AbstractC0167z f13876D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str, long j, long j3, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j3, false, L.f2000e);
        C0165x c0165x = AbstractC0167z.f2083b;
    }

    public g(String str, g gVar, String str2, long j, int i7, long j3, DrmInitData drmInitData, String str3, String str4, long j7, long j8, boolean z4, List list) {
        super(str, gVar, j, i7, j3, drmInitData, str3, str4, j7, j8, z4);
        this.f13875C = str2;
        this.f13876D = AbstractC0167z.E(list);
    }
}
