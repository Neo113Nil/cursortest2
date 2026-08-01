package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.R;
import com.chartboost.sdk.impl.na;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class w8 extends t4 {
    public final na e;
    public final t5 f;
    public final da g;
    public final CoroutineDispatcher h;
    public final v2 i;
    public Job j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5054a;

        static {
            int[] iArr = new int[na.b.values().length];
            try {
                iArr[na.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[na.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[na.b.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[na.b.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5054a = iArr;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ImageView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.d = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w8.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v2 v2Var = w8.this.i;
                String b = w8.this.e.b();
                this.b = 1;
                obj = v2Var.a(b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.d.setImageBitmap(bitmap);
            }
            this.d.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w8(Context context, String str, String str2, na naVar, h7 h7Var, t5 t5Var, da daVar, CoroutineDispatcher coroutineDispatcher, Function1 function1, v2 v2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, naVar, h7Var, t5Var, daVar, (i & 128) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 256) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.w8$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w8.b((Context) obj);
            }
        } : function1, (i & 512) != 0 ? new v2(null, null, null, 7, null) : v2Var);
    }

    public static final s5 a(da daVar, Context context, t5 cb, h7 et) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        Intrinsics.checkNotNullParameter(et, "et");
        return new s2(daVar, new ah(context), cb, et);
    }

    public static final r2 b(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new r2(it);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(final Context context, String baseUrl, String html, na infoIcon, h7 eventTracker, t5 callback, final da impressionInterface, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory, v2 cbImageDownloader) {
        super(context, html, callback, impressionInterface, baseUrl, eventTracker, cbWebViewFactory, null, new Function2() { // from class: com.chartboost.sdk.impl.w8$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w8.a(da.this, context, (t5) obj, (h7) obj2);
            }
        }, 128, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.e = infoIcon;
        this.f = callback;
        this.g = impressionInterface;
        this.h = dispatcher;
        this.i = cbImageDownloader;
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public final void a(RelativeLayout container) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a(this.e.e().b()), a(this.e.e().a()));
        int i = a.f5054a[this.e.d().ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        layoutParams.setMargins(a(this.e.c().b()), a(this.e.c().a()), a(this.e.c().b()), a(this.e.c().a()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cb_info_icon);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.w8$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8.a(w8.this, view);
            }
        });
        imageView.setVisibility(8);
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.h), null, null, new b(imageView, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.chartboost.sdk.impl.w8$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w8.a(w8.this, (Throwable) obj);
            }
        });
        this.j = launch$default;
        container.addView(imageView, layoutParams);
        this.f.a(imageView);
    }

    public static final void a(w8 w8Var, View view) {
        w8Var.g.a(new k3(w8Var.e.a(), Boolean.FALSE));
    }

    public static final Unit a(w8 w8Var, Throwable th) {
        w8Var.j = null;
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.qk
    public void a() {
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.j = null;
        super.a();
    }

    public final int a(double d) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            d *= displayMetrics.density;
        }
        return MathKt.roundToInt(d);
    }
}
