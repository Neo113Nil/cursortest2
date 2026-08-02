package androidx.compose.runtime;

import com.google.firebase.sessions.ProcessDataManagerImpl;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.runtime.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0215f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0215f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String myProcessName_delegate$lambda$0;
        switch (this.a) {
            case 0:
                return ComposerImpl.doCompose_aFTiNEg$lambda$56$lambda$55((ComposerImpl) this.b);
            default:
                myProcessName_delegate$lambda$0 = ProcessDataManagerImpl.myProcessName_delegate$lambda$0((ProcessDataManagerImpl) this.b);
                return myProcessName_delegate$lambda$0;
        }
    }
}
