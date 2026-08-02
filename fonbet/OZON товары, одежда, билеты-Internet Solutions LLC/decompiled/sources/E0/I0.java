package E0;

import D1.C2811l;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.core.view.C5333o;
import h1.C6769b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import p0.C8824b;

/* loaded from: classes8.dex */
final class I0 extends AbstractC7737t implements Function1<C6769b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(F0 f02) {
        super(1);
        this.f7043b = f02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C6769b c6769b) {
        Activity activity;
        C6769b c6769b2 = c6769b;
        F0 f02 = this.f7043b;
        if (C8824b.a(f02) != null) {
            ClipData clipData = c6769b2.a().getClipData();
            int itemCount = clipData.getItemCount();
            int i11 = 0;
            while (true) {
                if (i11 >= itemCount) {
                    break;
                }
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri == null || !Intrinsics.d(uri.getScheme(), "content")) {
                    i11++;
                } else if (f02.getNode().isAttached()) {
                    Context context = C2811l.a(f02).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        }
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (activity != null) {
                        C5333o.a(activity, c6769b2.a());
                    }
                }
            }
        }
        return Unit.f71690a;
    }
}
