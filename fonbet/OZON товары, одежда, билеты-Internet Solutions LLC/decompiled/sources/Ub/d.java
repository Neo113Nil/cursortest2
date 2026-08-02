package Ub;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class d {

    public interface a {
        @NonNull
        a a(@NonNull Ub.a aVar);

        @NonNull
        d build();
    }

    @NonNull
    public static a a(@NonNull Context context) {
        e eVar = new e(context);
        eVar.a(Vb.p.c());
        return eVar;
    }

    public abstract h b();

    @NonNull
    public abstract Hf.u c(@NonNull String str);

    @NonNull
    public abstract Spanned d(@NonNull Hf.u uVar);

    public abstract void e(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    public abstract SpannableStringBuilder f(@NonNull String str);
}
