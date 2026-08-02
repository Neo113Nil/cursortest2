package defpackage;

import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set LocalInspectionTables$lambda$0;
        switch (this.a) {
            case 0:
                return new j();
            default:
                LocalInspectionTables$lambda$0 = InspectionTablesKt.LocalInspectionTables$lambda$0();
                return LocalInspectionTables$lambda$0;
        }
    }
}
