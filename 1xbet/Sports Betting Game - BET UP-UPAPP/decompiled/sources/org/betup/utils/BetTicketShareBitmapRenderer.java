package org.betup.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetTicketShareBitmapRenderer.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u000e0\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lorg/betup/utils/BetTicketShareBitmapRenderer;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "CHUNK_HEIGHT_PX", "", "captureVerticallyChunked", "", "Landroid/graphics/Bitmap;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "w", CmcdData.STREAMING_FORMAT_HLS, "renderOffscreen", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "item", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "widthPx", "onResult", "Lkotlin/Function1;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetTicketShareBitmapRenderer {
    public static final int $stable = 0;
    private static final int CHUNK_HEIGHT_PX = 3200;
    public static final BetTicketShareBitmapRenderer INSTANCE = new BetTicketShareBitmapRenderer();

    private BetTicketShareBitmapRenderer() {
    }

    private final List<Bitmap> captureVerticallyChunked(View view, int w, int h) {
        if (w <= 0 || h <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < h) {
            int min = Math.min(CHUNK_HEIGHT_PX, h - i);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(w, min, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNull(createBitmap);
                try {
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(0.0f, -i);
                    view.draw(canvas);
                    arrayList.add(createBitmap);
                    i += min;
                } catch (Exception unused) {
                    createBitmap.recycle();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Bitmap) it.next()).recycle();
                    }
                    return CollectionsKt.emptyList();
                }
            } catch (OutOfMemoryError unused2) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Bitmap) it2.next()).recycle();
                }
                return CollectionsKt.emptyList();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1] */
    public final void renderOffscreen(FragmentActivity activity, BetsListModel item, OddType oddType, int widthPx, final Function1<? super List<Bitmap>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (widthPx <= 0) {
            onResult.invoke(CollectionsKt.emptyList());
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            onResult.invoke(CollectionsKt.emptyList());
            return;
        }
        Integer valueOf = Integer.valueOf(viewGroup.getWidth());
        Integer num = valueOf.intValue() > 0 ? valueOf : null;
        int intValue = num != null ? num.intValue() : widthPx;
        float m7774constructorimpl = Dp.m7774constructorimpl(intValue / activity.getResources().getDisplayMetrics().density);
        final ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-431097813, true, new BetTicketShareBitmapRenderer$renderOffscreen$1(m7774constructorimpl, item, oddType)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = -50000;
        viewGroup.addView(composeView, layoutParams);
        composeView.setVisibility(4);
        final Handler handler = new Handler(Looper.getMainLooper());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Integer.MIN_VALUE;
        final int i = intValue;
        final ViewGroup viewGroup2 = viewGroup;
        final ?? r14 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                boolean renderOffscreen$tryCapture;
                if (atomicBoolean.get()) {
                    BetTicketShareBitmapRenderer.renderOffscreen$removePreDrawSafe(composeView, this);
                    return true;
                }
                renderOffscreen$tryCapture = BetTicketShareBitmapRenderer.renderOffscreen$tryCapture(atomicBoolean, i, composeView, intRef, handler, onResult, viewGroup2);
                if (renderOffscreen$tryCapture) {
                    BetTicketShareBitmapRenderer.renderOffscreen$removePreDrawSafe(composeView, this);
                }
                return true;
            }
        };
        composeView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) r14);
        final int i2 = intValue;
        final ViewGroup viewGroup3 = viewGroup;
        composeView.post(new Runnable() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BetTicketShareBitmapRenderer.renderOffscreen$lambda$7(atomicBoolean, i2, composeView, intRef, handler, onResult, viewGroup3);
            }
        });
        final int i3 = intValue;
        final ViewGroup viewGroup4 = viewGroup;
        handler.postDelayed(new Runnable() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BetTicketShareBitmapRenderer.renderOffscreen$lambda$8(BetTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1.this, atomicBoolean, composeView, i3, intRef, handler, onResult, viewGroup4);
            }
        }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    private static final void renderOffscreen$cleanupView(ComposeView composeView, ViewGroup viewGroup) {
        try {
            if (composeView.getParent() != null) {
                viewGroup.removeView(composeView);
            }
        } catch (Exception unused) {
        }
    }

    private static final void renderOffscreen$finish(AtomicBoolean atomicBoolean, Handler handler, final Function1<? super List<Bitmap>, Unit> function1, final ComposeView composeView, final ViewGroup viewGroup, final List<Bitmap> list) {
        if (atomicBoolean.compareAndSet(false, true)) {
            handler.post(new Runnable() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BetTicketShareBitmapRenderer.renderOffscreen$finish$lambda$6(Function1.this, list, composeView, viewGroup);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderOffscreen$finish$lambda$6(Function1 function1, List list, ComposeView composeView, ViewGroup viewGroup) {
        renderOffscreen$cleanupView(composeView, viewGroup);
        function1.invoke(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean renderOffscreen$tryCapture(AtomicBoolean atomicBoolean, int i, ComposeView composeView, Ref.IntRef intRef, Handler handler, Function1<? super List<Bitmap>, Unit> function1, ViewGroup viewGroup) {
        if (atomicBoolean.get()) {
            return true;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        composeView.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = composeView.getMeasuredWidth();
        int measuredHeight = composeView.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            composeView.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(i, 1), 1073741824), makeMeasureSpec2);
            measuredWidth = composeView.getMeasuredWidth();
            measuredHeight = composeView.getMeasuredHeight();
        }
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return false;
        }
        if (measuredHeight != intRef.element) {
            intRef.element = measuredHeight;
            return false;
        }
        composeView.layout(0, 0, measuredWidth, measuredHeight);
        List<Bitmap> captureVerticallyChunked = INSTANCE.captureVerticallyChunked(composeView, measuredWidth, measuredHeight);
        if (captureVerticallyChunked.isEmpty()) {
            return false;
        }
        renderOffscreen$finish(atomicBoolean, handler, function1, composeView, viewGroup, captureVerticallyChunked);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderOffscreen$removePreDrawSafe(ComposeView composeView, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        ViewTreeObserver viewTreeObserver = composeView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderOffscreen$lambda$7(AtomicBoolean atomicBoolean, int i, ComposeView composeView, Ref.IntRef intRef, Handler handler, Function1 function1, ViewGroup viewGroup) {
        if (atomicBoolean.get()) {
            return;
        }
        renderOffscreen$tryCapture(atomicBoolean, i, composeView, intRef, handler, function1, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderOffscreen$lambda$8(BetTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1 betTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1, AtomicBoolean atomicBoolean, ComposeView composeView, int i, Ref.IntRef intRef, Handler handler, Function1 function1, ViewGroup viewGroup) {
        renderOffscreen$removePreDrawSafe(composeView, betTicketShareBitmapRenderer$renderOffscreen$preDrawListener$1);
        if (atomicBoolean.get() || renderOffscreen$tryCapture(atomicBoolean, i, composeView, intRef, handler, function1, viewGroup)) {
            return;
        }
        renderOffscreen$finish(atomicBoolean, handler, function1, composeView, viewGroup, CollectionsKt.emptyList());
    }
}
