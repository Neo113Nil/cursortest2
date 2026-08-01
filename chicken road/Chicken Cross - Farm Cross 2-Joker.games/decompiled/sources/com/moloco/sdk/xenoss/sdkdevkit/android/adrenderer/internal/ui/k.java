package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewCompat;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f11171a = new AtomicBoolean(false);

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f11172a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ String c;

        public a(View view, ImageView imageView, String str) {
            this.f11172a = view;
            this.b = imageView;
            this.c = str;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f11172a.removeOnAttachStateChangeListener(this);
            boolean isHardwareAccelerated = this.b.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                k.b();
            }
            ImageView imageView = this.b;
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder target = new ImageRequest.Builder(imageView.getContext()).data(this.c).target(imageView);
            target.allowHardware(isHardwareAccelerated);
            imageLoader.enqueue(target.build());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public static final Unit a(String str, ContentScale contentScale, Modifier modifier, int i, Composer composer, int i2) {
        a(str, contentScale, modifier, composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final void b() {
        if (f11171a.compareAndSet(false, true)) {
            com.moloco.sdk.internal.services.x b = a.e.f10870a.l().b();
            MetricsRecorder.INSTANCE.withNoMediation().recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b0.c()).withTag("manufacturer", b.t()).withTag("model", b.v()).withTag("os_version", b.x()).withTag("api_level", String.valueOf(b.n())));
        }
    }

    public static final void a(final String str, final ContentScale contentScale, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(481470006);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(contentScale) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481470006, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CoilAsyncImage (CoilAsyncImage.kt:35)");
            }
            final boolean isHardwareAccelerated = ((View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView())).isHardwareAccelerated();
            startRestartGroup.startReplaceableGroup(313993790);
            boolean changed = startRestartGroup.changed(isHardwareAccelerated);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k.a(isHardwareAccelerated);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            composer2 = startRestartGroup;
            SingletonAsyncImageKt.m4330AsyncImage3HmZ8SU(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(str).allowHardware(isHardwareAccelerated).build(), null, modifier, null, null, null, contentScale, 0.0f, null, 0, startRestartGroup, (i2 & 896) | 48 | ((i2 << 15) & 3670016), 952);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.a(str, contentScale, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(boolean z) {
        if (!z) {
            b();
        }
        return Unit.INSTANCE;
    }

    public static final void a(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str != null) {
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader imageLoader = Coil.imageLoader(context);
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageLoader.enqueue(new ImageRequest.Builder(context2).data(str).build());
        }
        if (ViewCompat.isAttachedToWindow(imageView)) {
            boolean isHardwareAccelerated = imageView.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                b();
            }
            ImageLoader imageLoader2 = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder target = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
            target.allowHardware(isHardwareAccelerated);
            imageLoader2.enqueue(target.build());
            return;
        }
        imageView.addOnAttachStateChangeListener(new a(imageView, imageView, str));
    }
}
