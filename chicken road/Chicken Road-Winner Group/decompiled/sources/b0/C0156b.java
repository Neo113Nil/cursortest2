package b0;

import android.os.Build;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0156b extends AbstractC0157c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0156b(String str, String str2, int i3) {
        super(str, str2);
        this.f2450d = i3;
    }

    @Override // b0.AbstractC0157c
    public final boolean a() {
        switch (this.f2450d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 27) {
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 28) {
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156b(String str) {
        super("IMPLEMENTATION_ONLY_FEATURE", str);
        this.f2450d = 3;
    }
}
