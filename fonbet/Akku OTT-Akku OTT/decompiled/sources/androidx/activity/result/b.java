package androidx.activity.result;

import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugins.googlesignin.ResultUtilsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ActivityResultCallback, OnSuccessListener {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ b(Function1 function1) {
        this.a = function1;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        this.a.invoke(obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ResultUtilsKt.completeWithUnitSuccess(this.a);
    }
}
