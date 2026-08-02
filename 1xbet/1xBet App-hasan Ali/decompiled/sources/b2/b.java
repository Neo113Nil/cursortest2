package b2;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import r.C2327e;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public p f7223a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f7224b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7225c;

    /* renamed from: d, reason: collision with root package name */
    public C2327e f7226d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
