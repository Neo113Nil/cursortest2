package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.util.l;

/* loaded from: classes3.dex */
public abstract class c<T extends Drawable> implements x<T>, t {
    public final T a;

    public c(T t) {
        l.c(t, "Argument must not be null");
        this.a = t;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Object get() {
        T t = this.a;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.t
    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t).a.a.l.prepareToDraw();
        }
    }
}
