package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.Hb;
import com.ironsource.InterfaceC4492k5;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface o extends InterfaceC4492k5<String> {

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final String f8403a;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f8403a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC4492k5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f8403a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Hb<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.f8403a);
        }
    }

    <T> T a(Hb<String, T> hb);
}
