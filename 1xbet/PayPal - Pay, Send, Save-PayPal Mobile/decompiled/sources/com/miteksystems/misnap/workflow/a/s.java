package com.miteksystems.misnap.workflow.a;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0016\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0019"}, d2 = {"", "key", "Landroid/os/Bundle;", "args", "", "d", "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Integer;", "", "c", "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Float;", "", util.h.xy.cb.b.f1091, "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Boolean;", "e", "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;", "Ljava/io/Serializable;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/io/Serializable;", "Landroid/content/Context;", "context", "drawableId", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "animationId", "Landroid/view/animation/Animation;", "(Landroid/content/Context;I)Landroid/view/animation/Animation;"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class s {
    public static final /* synthetic */ android.view.animation.Animation a(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (i != 0) {
            return android.view.animation.AnimationUtils.loadAnimation(context, i);
        }
        return null;
    }

    public static final /* synthetic */ java.lang.Boolean b(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        return java.lang.Boolean.valueOf(bundle.getBoolean(str, false));
    }

    public static final /* synthetic */ java.io.Serializable a(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    public static final /* synthetic */ android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (i != 0) {
            return androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i);
        }
        return null;
    }

    public static final /* synthetic */ java.lang.String e(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        return bundle.getString(str, "");
    }

    public static final /* synthetic */ java.lang.Integer d(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        return java.lang.Integer.valueOf(bundle.getInt(str, 0));
    }

    public static final /* synthetic */ java.lang.Float c(java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        return java.lang.Float.valueOf(bundle.getFloat(str, 0.0f));
    }
}
