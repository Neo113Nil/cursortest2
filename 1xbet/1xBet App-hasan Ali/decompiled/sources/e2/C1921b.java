package e2;

import android.os.Build;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1921b extends AbstractC1922c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1921b(int i, String str, String str2) {
        super(str, str2);
        this.f16902d = i;
    }

    @Override // e2.AbstractC1922c
    public final boolean a() {
        switch (this.f16902d) {
            case 0:
                return true;
            case 1:
                return Build.VERSION.SDK_INT >= 24;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
