package androidx.datastore.preferences.core;

import java.io.File;
import java.lang.reflect.GenericDeclaration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.KTypeParameterBase;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File createWithPath$lambda$0;
        GenericDeclaration javaContainingDeclaration_delegate$lambda$0;
        switch (this.a) {
            case 0:
                createWithPath$lambda$0 = PreferenceDataStoreFactory.createWithPath$lambda$0((Function0) this.b);
                return createWithPath$lambda$0;
            default:
                javaContainingDeclaration_delegate$lambda$0 = KTypeParameterBase.javaContainingDeclaration_delegate$lambda$0((KTypeParameterBase) this.b);
                return javaContainingDeclaration_delegate$lambda$0;
        }
    }
}
