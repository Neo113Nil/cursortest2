package Q2;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5794c;

    public a(Context context, VersionInfoParcel versionInfoParcel) {
        this.f5792a = context;
        this.f5793b = context.getPackageName();
        this.f5794c = versionInfoParcel.f10834a;
    }
}
