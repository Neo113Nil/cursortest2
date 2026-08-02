package io.flutter.plugins.firebase.core;

import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.util.ViewUtils;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements OnCompleteListener, ViewUtils.ViewVisitor {
    public final /* synthetic */ Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseCorePlugin.lambda$listenToResponse$1((GeneratedAndroidFirebaseCore.Result) this.a, task);
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        boolean lambda$hasChildViewOfType$1;
        lambda$hasChildViewOfType$1 = ViewUtils.lambda$hasChildViewOfType$1((Class[]) this.a, view);
        return lambda$hasChildViewOfType$1;
    }
}
