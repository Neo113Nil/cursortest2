package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.widget.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0647k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f8676a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f8676a = field;
    }
}
