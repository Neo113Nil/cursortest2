package G4;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import io.sentry.protocol.SentryId;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements L4.n, LazyEvaluator.Evaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2880a;

    public /* synthetic */ E(String str) {
        this.f2880a = str;
    }

    @Override // L4.n
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            return null;
        }
        return new D4.e(this.f2880a, cursor.getInt(0), new H4.n(new Timestamp(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        String lambda$new$2;
        lambda$new$2 = SentryId.lambda$new$2(this.f2880a);
        return lambda$new$2;
    }
}
