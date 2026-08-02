package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class A extends t {
    public final int e;

    @Nullable
    public EditText f;
    public final z g;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.material.textfield.z] */
    public A(@NonNull s sVar, @DrawableRes int i) {
        super(sVar);
        this.e = R.drawable.design_password_eye;
        this.g = new View.OnClickListener() { // from class: com.google.android.material.textfield.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                A a = A.this;
                EditText editText = a.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = a.f;
                if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    a.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    a.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    a.f.setSelection(selectionEnd);
                }
                a.q();
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // com.google.android.material.textfield.t
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.t
    @StringRes
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.t
    @DrawableRes
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.t
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.t
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.t
    public final void m(@Nullable EditText editText) {
        this.f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.t
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.t
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
