package a70;

import e70.EnumC6315b;
import e70.InterfaceC6317d;
import java.io.InputStream;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;

/* renamed from: a70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4958a {
    Object a(@NotNull d<? super InterfaceC6317d<TransferData, ? extends EnumC6315b>> dVar);

    Object b(@NotNull d<? super InterfaceC6317d<MainData, ? extends EnumC6315b>> dVar);

    Object c(@NotNull d<? super InterfaceC6317d<CbottomData, ? extends EnumC6315b>> dVar);

    Object d(@NotNull String str, @NotNull d<? super InterfaceC6317d<? extends InputStream, ? extends EnumC6315b>> dVar);
}
