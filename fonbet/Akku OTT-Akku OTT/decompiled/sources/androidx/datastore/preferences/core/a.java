package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.settings.SessionConfigs;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0;
        SessionConfigs sessionConfigsDataStore$lambda$0;
        switch (this.a) {
            case 0:
                string$lambda$0 = MutablePreferences.toString$lambda$0((Map.Entry) obj);
                return string$lambda$0;
            default:
                sessionConfigsDataStore$lambda$0 = FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
                return sessionConfigsDataStore$lambda$0;
        }
    }
}
