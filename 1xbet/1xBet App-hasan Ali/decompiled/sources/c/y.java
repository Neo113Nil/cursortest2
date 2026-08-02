package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class y extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Field f7371a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7372b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7373c;

    public y(Field field, Field field2, Field field3) {
        this.f7371a = field;
        this.f7372b = field2;
        this.f7373c = field3;
    }

    @Override // c.w
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f7373c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // c.w
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f7371a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // c.w
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f7372b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
