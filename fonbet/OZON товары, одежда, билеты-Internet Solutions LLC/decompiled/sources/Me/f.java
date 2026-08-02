package Me;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface f {
    boolean b();

    @NotNull
    f c(int i11);

    int d();

    @NotNull
    String e(int i11);

    @NotNull
    String f();

    @NotNull
    List<Annotation> getAnnotations();

    @NotNull
    m getKind();

    boolean isInline();
}
