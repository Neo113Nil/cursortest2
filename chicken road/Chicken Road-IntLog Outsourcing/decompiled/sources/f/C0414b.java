package f;

import android.content.Context;
import android.content.Intent;
import e.C0400a;
import e.C0408i;
import kotlin.jvm.internal.i;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414b extends AbstractC0413a {
    @Override // f.AbstractC0413a
    public final Intent a(Context context, C0408i c0408i) {
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0408i);
        i.d(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // f.AbstractC0413a
    public final Object b(int i2, Intent intent) {
        return new C0400a(i2, intent);
    }
}
