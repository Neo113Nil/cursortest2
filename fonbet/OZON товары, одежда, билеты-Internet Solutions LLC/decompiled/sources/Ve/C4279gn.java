package Ve;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVe/gn;", "Landroidx/fragment/app/m;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Ve.gn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4279gn extends ComponentCallbacksC5392m {
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "<this>");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.spay_layout_empty, (ViewGroup) null, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        Intrinsics.checkNotNullExpressionValue(new Xl(frameLayout), "inflate(layoutInflater)");
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        return frameLayout;
    }
}
