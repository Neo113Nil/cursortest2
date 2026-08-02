package androidx.compose.runtime;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.runtime.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0212c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0212c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List currentStackTrace;
        File sessionDataStore$lambda$5;
        switch (this.a) {
            case 0:
                currentStackTrace = ((ComposerImpl) this.b).currentStackTrace();
                return currentStackTrace;
            default:
                sessionDataStore$lambda$5 = FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5((Context) this.b);
                return sessionDataStore$lambda$5;
        }
    }
}
