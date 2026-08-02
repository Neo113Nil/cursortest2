package Gl;

import He.g;
import S7.r;
import T7.Y;
import U7.A;
import android.content.Context;
import android.view.View;
import b8.C5581a;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.F;
import gk0.InterfaceC6746B;
import i8.q;
import java.security.GeneralSecurityException;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* renamed from: Gl.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3124a implements InterfaceC6746B, AbstractC5889h.a, B.b {
    public static int a(int i11, int i12, int i13, int i14) {
        return ((i11 - i12) / i13) + i14;
    }

    public static int c(BadgeDTO badgeDTO, int i11, int i12) {
        return (badgeDTO.hashCode() + i11) * i12;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(g gVar, r rVar) {
        return A.a((Y) gVar, rVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        C5581a c5581a = (C5581a) gVar;
        if (c5581a.i().d() == 32) {
            return q.b(c5581a);
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        SmallIconButtonView init$lambda$14$lambda$5;
        init$lambda$14$lambda$5 = AtomActionInitializer.init$lambda$14$lambda$5(context);
        return init$lambda$14$lambda$5;
    }
}
