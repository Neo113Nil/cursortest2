package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.AbstractC1174a;
import n3.AbstractC1464a;
import w1.C1726n0;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663t {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f8738a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f8739b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8740c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8741d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8742e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8743f;

    public /* synthetic */ C0663t(TextView textView) {
        this.f8743f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f8743f;
        Drawable a2 = V.c.a(compoundButton);
        if (a2 != null) {
            if (this.f8740c || this.f8741d) {
                Drawable mutate = a2.mutate();
                if (this.f8740c) {
                    J.a.h(mutate, this.f8738a);
                }
                if (this.f8741d) {
                    J.a.i(mutate, this.f8739b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f8743f;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f8740c || this.f8741d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f8740c) {
                    J.a.h(mutate, this.f8738a);
                }
                if (this.f8741d) {
                    J.a.i(mutate, this.f8739b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f8743f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1174a.f13335n;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        P.U.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC1464a.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    V.b.c(compoundButton, F7.q(2));
                }
                if (typedArray.hasValue(3)) {
                    V.b.d(compoundButton, AbstractC0637f0.c(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC1464a.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            F7.H();
        }
    }
}
