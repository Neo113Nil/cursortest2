package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420ch extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final R8 f7113b;

    public C0420ch(C0459e5 c0459e5) {
        this(c0459e5, c0459e5.j());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        EnumC0619ka enumC0619ka;
        if (!TextUtils.isEmpty(w5.getName())) {
            R8 r8 = this.f7113b;
            String name = w5.getName();
            if (r8.f6503c == null) {
                r8.a();
            }
            int hashCode = name.hashCode();
            if (r8.f6503c.f6649b.contains(Integer.valueOf(hashCode))) {
                enumC0619ka = EnumC0619ka.NON_FIRST_OCCURENCE;
            } else {
                T8 t8 = r8.f6503c;
                EnumC0619ka enumC0619ka2 = t8.f6648a ? EnumC0619ka.FIRST_OCCURRENCE : EnumC0619ka.UNKNOWN;
                if (t8.f6651d < 1000) {
                    t8.f6649b.add(Integer.valueOf(hashCode));
                    t8.f6651d++;
                } else {
                    t8.f6648a = false;
                }
                W8 w8 = r8.f6502b;
                T8 t82 = r8.f6503c;
                IBinaryDataHelper iBinaryDataHelper = w8.f6792c;
                V8 v8 = w8.f6791b;
                w8.f6790a.getClass();
                iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t82)));
                enumC0619ka = enumC0619ka2;
            }
            w5.f6784k = enumC0619ka;
        }
        return false;
    }

    public C0420ch(C0459e5 c0459e5, R8 r8) {
        super(c0459e5);
        this.f7113b = r8;
    }
}
