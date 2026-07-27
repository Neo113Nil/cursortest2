package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.net.URL;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class kd extends h2 {
    public static final a n = new a(null);
    public static final int o = R.drawable.chartboost_monetization_default_icon_background;
    public static final int p = Color.parseColor("#4C6EF5");
    public static final Typeface q = Typeface.DEFAULT_BOLD;
    public final String f;
    public final String g;
    public final CoroutineDispatcher h;
    public final v2 i;
    public final ImageView j;
    public final TextView k;
    public final Button l;
    public Job m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ URL e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URL url, Continuation continuation) {
            super(2, continuation);
            this.e = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = kd.this.new b(this.e, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                v2 v2Var = kd.this.i;
                String url = this.e.toString();
                Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                this.c = coroutineScope;
                this.b = 1;
                obj = v2Var.a(url, this);
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
                kd kdVar = kd.this;
                kdVar.getIconView().setImageBitmap(bitmap);
                kdVar.getIconView().setVisibility(0);
            } else {
                kd.this.getIconView().setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ kd(Context context, AttributeSet attributeSet, int i, String str, String str2, CoroutineDispatcher coroutineDispatcher, v2 v2Var, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? context.getString(R.string.persistent_cta_description, "App Name") : str, (i2 & 16) != 0 ? context.getString(R.string.open_app_button_description, "App Name") : str2, (i2 & 32) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i2 & 64) != 0 ? new v2(null, null, null, 7, null) : v2Var, (i2 & 128) == 0 ? function0 : null);
    }

    public final void b() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(this.l.getId(), 3);
        constraintSet.clear(this.l.getId(), 4);
        constraintSet.connect(this.l.getId(), 3, 0, 3);
        constraintSet.connect(this.l.getId(), 4, 0, 4);
        constraintSet.clear(this.l.getId(), 1);
        constraintSet.clear(this.l.getId(), 2);
        if (this.j.getVisibility() == 0) {
            constraintSet.clear(this.j.getId(), 3);
            constraintSet.clear(this.j.getId(), 4);
            constraintSet.clear(this.j.getId(), 1);
            constraintSet.clear(this.j.getId(), 2);
            constraintSet.connect(this.j.getId(), 1, 0, 1);
            constraintSet.connect(this.j.getId(), 3, 0, 3);
            constraintSet.connect(this.j.getId(), 4, 0, 4);
        }
        if (this.k.getVisibility() == 0) {
            constraintSet.clear(this.k.getId(), 3);
            constraintSet.clear(this.k.getId(), 4);
            constraintSet.clear(this.k.getId(), 1);
            constraintSet.clear(this.k.getId(), 2);
            constraintSet.connect(this.k.getId(), 1, this.j.getVisibility() == 0 ? this.j.getId() : 0, 2, a(12));
            constraintSet.connect(this.k.getId(), 3, 0, 3);
            constraintSet.connect(this.k.getId(), 4, 0, 4);
        }
        if (this.j.getVisibility() == 0 && this.k.getVisibility() == 0) {
            constraintSet.connect(this.l.getId(), 1, this.k.getId(), 2, a(12));
            constraintSet.connect(this.l.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.l.getId(), -2);
        } else if (this.j.getVisibility() == 8 && this.k.getVisibility() == 0) {
            constraintSet.connect(this.k.getId(), 1, 0, 1, a(12));
            constraintSet.connect(this.l.getId(), 1, this.k.getId(), 2, a(12));
            constraintSet.connect(this.l.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.l.getId(), -2);
        } else if (this.j.getVisibility() == 8 && this.k.getVisibility() == 8) {
            constraintSet.connect(this.l.getId(), 1, 0, 1, a(12));
            constraintSet.connect(this.l.getId(), 2, 0, 2, a(12));
            constraintSet.constrainWidth(this.l.getId(), 0);
        }
        constraintSet.applyTo(this);
    }

    public final Job getAppIconDownloadJob() {
        return this.m;
    }

    public final ImageView getIconView() {
        return this.j;
    }

    public final Button getOpenButton() {
        return this.l;
    }

    public final TextView getTitleText() {
        return this.k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.m = null;
        super.onViewRemoved(view);
    }

    public final void setAppIconDownloadJob(Job job) {
        this.m = job;
    }

    public final void setIcon(int i) {
        this.j.setImageResource(i);
        this.j.setVisibility(0);
    }

    public final void setOpenText(String str) {
        if (str == null || str.length() == 0) {
            str = "Get";
        }
        this.l.setText(str);
        this.l.setContentDescription(getContext().getString(R.string.open_app_custom_button_description, str, this.k.getText()));
        this.l.requestLayout();
    }

    public final void setTitle(String str) {
        if (str == null || str.length() == 0) {
            this.k.setVisibility(8);
            return;
        }
        this.k.setText(str);
        this.k.setVisibility(0);
        setContentDescription(getContext().getString(R.string.persistent_cta_description, str));
        this.l.setContentDescription(getContext().getString(R.string.open_app_button_description, str));
    }

    public static final void a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.h2
    public void a(p5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        o1 a2 = config.a();
        setTitle(a2 != null ? a2.c() : null);
        setIcon(a2 != null ? a2.b() : null);
        setOpenText(a2 != null ? a2.a() : null);
        b();
    }

    public final void setIcon(URL url) {
        Job launch$default;
        if (url != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.h), null, null, new b(url, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: com.chartboost.sdk.impl.kd$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return kd.a(kd.this, (Throwable) obj);
                }
            });
            this.m = launch$default;
            return;
        }
        this.j.setVisibility(8);
    }

    @Override // com.chartboost.sdk.impl.h2
    public void a(wk tracker, uk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
    }

    public static final Unit a(kd kdVar, Throwable th) {
        kdVar.m = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(Context context, AttributeSet attributeSet, int i, String persistentCtaContentDescription, String openButtonContentDescription, CoroutineDispatcher dispatcher, v2 cbImageDownloader, final Function0 function0) {
        super(context, attributeSet, i, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        Intrinsics.checkNotNullParameter(openButtonContentDescription, "openButtonContentDescription");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.f = persistentCtaContentDescription;
        this.g = openButtonContentDescription;
        this.h = dispatcher;
        this.i = cbImageDownloader;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, a(84)));
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(View.generateViewId());
        shapeableImageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(48), a(48)));
        shapeableImageView.setImageResource(o);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setImportantForAccessibility(2);
        shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(0, a(12)).build());
        this.j = shapeableImageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.matchConstraintMinWidth = a(100);
        textView.setLayoutParams(layoutParams);
        textView.setText("App Name");
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setTypeface(q);
        textView.setGravity(16);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        this.k = textView;
        Button button = new Button(context);
        button.setId(View.generateViewId());
        button.setLayoutParams(new ConstraintLayout.LayoutParams(-2, a(44)));
        button.setText("Get");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setGravity(17);
        button.setMinWidth(a(80));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a(8));
        gradientDrawable.setColor(p);
        button.setBackground(gradientDrawable);
        button.setPadding(a(16), 0, a(16), 0);
        button.setContentDescription(openButtonContentDescription);
        button.setFocusable(true);
        button.setClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.kd$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kd.a(Function0.this, view);
            }
        });
        this.l = button;
        setContentDescription(persistentCtaContentDescription);
        addView(shapeableImageView);
        addView(textView);
        addView(button);
        b();
    }
}
