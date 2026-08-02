package M8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class h implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f17699a = new ArrayList();

    public final ArrayList a() {
        return this.f17699a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            g gVar = new g();
            gVar.readExternal(objectInput);
            this.f17699a.add(gVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.f17699a;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((g) arrayList.get(i11)).writeExternal(objectOutput);
        }
    }
}
