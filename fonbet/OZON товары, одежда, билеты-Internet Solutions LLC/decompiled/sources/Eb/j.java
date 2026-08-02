package Eb;

import Sc.r;
import Sc.s;
import android.os.Parcelable;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import kotlin.jvm.internal.Intrinsics;
import mb.C8122a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class j {
    public static final boolean a(@NotNull Object obj) {
        r.Companion companion = r.INSTANCE;
        boolean z11 = obj instanceof r.b;
        if (z11) {
            return false;
        }
        if (z11) {
            obj = null;
        }
        CharSequence charSequence = (CharSequence) obj;
        return (charSequence == null || kotlin.text.h.K(charSequence)) ? false : true;
    }

    @NotNull
    public static final <T extends Parcelable> AidlResult<?> b(@NotNull Object obj) {
        try {
            s.b(obj);
            Parcelable data = (Parcelable) obj;
            Intrinsics.checkNotNullParameter(data, "data");
            return new AidlResult<>(data);
        } catch (Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(exception, "<this>");
            String valueOf = String.valueOf(exception.getMessage());
            return new AidlResult<>(exception instanceof C8122a ? new AidlException(103, valueOf) : exception instanceof IllegalStateException ? new AidlException(102, valueOf) : exception instanceof IllegalArgumentException ? new AidlException(101, valueOf) : exception instanceof RuntimeException ? new AidlException(100, valueOf) : new AidlException(0, valueOf));
        }
    }
}
