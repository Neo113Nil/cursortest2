package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class u0 extends Fragment implements InterfaceC0837k {
    public static final WeakHashMap b = new WeakHashMap();
    public final w0 a = new w0();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0837k
    public final void a(String str, @NonNull C0836j c0836j) {
        this.a.a(str, c0836j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0837k
    @Nullable
    public final C0836j b(Class cls, String str) {
        return (C0836j) cls.cast(this.a.a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0837k
    @Nullable
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.a.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        w0 w0Var = this.a;
        w0Var.b = 5;
        Iterator it = w0Var.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        w0 w0Var = this.a;
        w0Var.b = 3;
        Iterator it = w0Var.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        w0 w0Var = this.a;
        w0Var.b = 2;
        Iterator it = w0Var.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        w0 w0Var = this.a;
        w0Var.b = 4;
        Iterator it = w0Var.a.values().iterator();
        while (it.hasNext()) {
            ((C0836j) it.next()).onStop();
        }
    }
}
