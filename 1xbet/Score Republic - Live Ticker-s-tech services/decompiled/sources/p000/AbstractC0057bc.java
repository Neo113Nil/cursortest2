package p000;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: renamed from: bc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0057bc {

    /* JADX INFO: renamed from: a */
    public final zc0 f813a;

    /* JADX INFO: renamed from: b */
    public final ad0 f814b;

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f815c;

    public AbstractC0057bc(ad0 ad0Var, LayoutInflater layoutInflater, zc0 zc0Var) {
        this.f814b = ad0Var;
        this.f815c = layoutInflater;
        this.f813a = zc0Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m634f(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            m80.m3346m("Error parsing background color: " + e.toString() + " color: " + str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m635g(Button button, C0909yc c0909yc) {
        String str = c0909yc.f9269a.f8887b;
        String str2 = c0909yc.f9270b;
        try {
            Drawable background = button.getBackground();
            background.setTint(Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e) {
            m80.m3346m("Error parsing background color: " + e.toString());
        }
        button.setText(c0909yc.f9269a.f8886a);
        button.setTextColor(Color.parseColor(str));
    }

    /* JADX INFO: renamed from: a */
    public ad0 mo629a() {
        return this.f814b;
    }

    /* JADX INFO: renamed from: b */
    public View.OnClickListener mo630b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract ImageView mo631c();

    /* JADX INFO: renamed from: d */
    public abstract ViewGroup mo632d();

    /* JADX INFO: renamed from: e */
    public abstract ViewTreeObserver.OnGlobalLayoutListener mo633e(HashMap map, y00 y00Var);
}
