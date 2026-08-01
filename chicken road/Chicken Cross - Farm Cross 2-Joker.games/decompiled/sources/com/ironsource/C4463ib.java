package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4463ib extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdViewHolder f8251a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4463ib(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8251a = new NativeAdViewHolder();
    }

    public final void a(C4409fb nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> a2 = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, a2);
        AdapterNativeAdViewBinder f = nativeAd.f();
        if (f != null) {
            f.setBodyView(this.f8251a.getBodyView());
            f.setMediaView(this.f8251a.getMediaView());
            f.setCallToActionView(this.f8251a.getCallToActionView());
            f.setTitleView(this.f8251a.getTitleView());
            f.setIconView(this.f8251a.getIconView());
            f.setAdvertiserView(this.f8251a.getAdvertiserView());
            f.setNativeAdView(frameLayout);
            addView(f.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f8251a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f8251a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f8251a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f8251a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f8251a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f8251a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4463ib(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8251a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
