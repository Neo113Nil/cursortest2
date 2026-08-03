package com.ironsource;

/* renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3404zd {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3404zd.a f6863a = new com.ironsource.C3404zd.a(null);

    /* renamed from: com.ironsource.zd$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final android.view.View a(android.content.Context context, java.lang.String str, com.ironsource.T8 imageLoader) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (str == null) {
                return a(context);
            }
            java.lang.Object a2 = imageLoader.a(str);
            if (kotlin.Result.m10804isFailureimpl(a2)) {
                a2 = null;
            }
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) a2;
            if (drawable == null) {
                return a(context);
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }

        private a() {
        }

        private static final android.graphics.drawable.GradientDrawable a() {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(android.graphics.Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final android.view.View a(android.content.Context context) {
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
            return textView;
        }
    }
}
