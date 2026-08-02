package com.google.gson.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.gson.InstanceCreator;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ObjectConstructor, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object createInstance;
        createInstance = ((InstanceCreator) this.a).createInstance((Type) this.b);
        return createInstance;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$updatePhoneNumber$14((GeneratedAndroidFirebaseAuth.Result) this.a, (FirebaseUser) this.b, task);
    }
}
