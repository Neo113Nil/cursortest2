package X70;

import d80.C6102c;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import n90.InterfaceC8456a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;
import ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment;

/* loaded from: classes3.dex */
public interface b extends X30.a {

    public interface a {
        @NotNull
        b a(@NotNull Y20.a aVar, @NotNull P30.b bVar, @NotNull M80.a aVar2, @NotNull Z80.a aVar3, @NotNull O90.a aVar4, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC8456a interfaceC8456a, @NotNull I40.a aVar5, @NotNull InterfaceC6422b interfaceC6422b);
    }

    void V0(@NotNull SharingPreviewFragment sharingPreviewFragment);

    void d1(@NotNull PhotoPreviewFragment photoPreviewFragment);

    void j0(@NotNull c80.b bVar);

    void w(@NotNull C6102c c6102c);
}
