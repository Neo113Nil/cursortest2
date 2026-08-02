package Kg0;

import Sc.InterfaceC3999a;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {
    public static void a(ViewGroup viewGroup, Dialog dialog, Function0 function0, Window window, Function1 function1, Function1 function12) {
        if (viewGroup.isAttachedToWindow()) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!b(context)) {
                try {
                    int width = viewGroup.getWidth();
                    int height = viewGroup.getHeight();
                    d dVar = new d(dialog, function12);
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    PixelCopy.request(window, createBitmap, new c(0, dVar, createBitmap), new Handler(Looper.getMainLooper()));
                    return;
                } catch (Throwable th2) {
                    if (function1 != null) {
                        function1.invoke(th2);
                        return;
                    }
                    return;
                }
            }
        }
        dialog.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    private static final boolean b(Context context) {
        Activity activity;
        Intrinsics.checkNotNullParameter(context, "<this>");
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
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static final void c(@NotNull final ViewGroup viewGroup, @NotNull final Function1 callback, final Function1 function1, final Function0 function0) {
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0 && viewGroup.isAttachedToWindow()) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!b(context)) {
                Context context2 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                WindowManager.LayoutParams layoutParams = null;
                a aVar = new a(context2, null, 0);
                aVar.a(viewGroup);
                final Dialog dialog = new Dialog(viewGroup.getContext(), R.style.Theme.Translucent.NoTitleBar);
                dialog.setContentView(aVar);
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setLayout(viewGroup.getWidth(), viewGroup.getHeight());
                }
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    Window window3 = dialog.getWindow();
                    if (window3 != null && (attributes = window3.getAttributes()) != null) {
                        attributes.x = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels + 1000;
                        attributes.width = viewGroup.getWidth();
                        attributes.height = viewGroup.getHeight();
                        attributes.gravity = 8388659;
                        attributes.flags = 520;
                        layoutParams = attributes;
                    }
                    window2.setAttributes(layoutParams);
                }
                dialog.show();
                final Window window4 = dialog.getWindow();
                if (window4 != null) {
                    window4.getDecorView().getRootView().post(new Runnable(viewGroup, dialog, function0, window4, function1, callback) { // from class: Kg0.b

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ ViewGroup f15960a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ Dialog f15961b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Function0 f15962c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ Window f15963d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ AbstractC7737t f15964e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ AbstractC7737t f15965f;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f15964e = (AbstractC7737t) function1;
                            this.f15965f = (AbstractC7737t) callback;
                        }

                        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
                        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ?? r42 = this.f15964e;
                            ?? r52 = this.f15965f;
                            e.a(this.f15960a, this.f15961b, this.f15962c, this.f15963d, r42, r52);
                        }
                    });
                    return;
                }
                dialog.dismiss();
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @InterfaceC3999a
    public static final void d(@NotNull g gVar, @NotNull Function1 callback, Function1 function1) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(gVar, callback, function1, null);
    }
}
