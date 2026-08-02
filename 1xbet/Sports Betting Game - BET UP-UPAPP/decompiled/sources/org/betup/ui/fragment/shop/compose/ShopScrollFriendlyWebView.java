package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopScrollFriendlyWebView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopScrollFriendlyWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onOverScrolled", "", "scrollX", "", "scrollY", "clampedX", "clampedY", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopScrollFriendlyWebView extends WebView {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopScrollFriendlyWebView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WebViewDialogStateGuard.INSTANCE.applyStateless(this);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ViewParent parent;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        ViewParent parent;
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
        if ((clampedX || clampedY) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
