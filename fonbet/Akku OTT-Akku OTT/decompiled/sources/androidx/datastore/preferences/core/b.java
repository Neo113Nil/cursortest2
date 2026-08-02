package androidx.datastore.preferences.core;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File create$lambda$0;
        File sessionConfigsDataStore$lambda$2;
        switch (this.a) {
            case 0:
                create$lambda$0 = PreferenceDataStoreFactory.create$lambda$0((Function0) this.b);
                return create$lambda$0;
            default:
                sessionConfigsDataStore$lambda$2 = FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2((Context) this.b);
                return sessionConfigsDataStore$lambda$2;
        }
    }
}
