package M8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class i implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17700a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17704e;

    /* renamed from: b, reason: collision with root package name */
    private String f17701b = "";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f17702c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f17703d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private String f17705f = "";

    public final String a() {
        return this.f17701b;
    }

    public final int b() {
        return ((Integer) this.f17702c.get(0)).intValue();
    }

    public final int d() {
        return this.f17702c.size();
    }

    public final ArrayList e() {
        return this.f17702c;
    }

    public final ArrayList f() {
        return this.f17703d;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f17700a = true;
            this.f17701b = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f17702c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i12 = 0; i12 < readInt2; i12++) {
            this.f17703d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f17704e = true;
            this.f17705f = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f17700a);
        if (this.f17700a) {
            objectOutput.writeUTF(this.f17701b);
        }
        int size = this.f17702c.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            objectOutput.writeInt(((Integer) this.f17702c.get(i11)).intValue());
        }
        ArrayList arrayList = this.f17703d;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            objectOutput.writeInt(((Integer) arrayList.get(i12)).intValue());
        }
        objectOutput.writeBoolean(this.f17704e);
        if (this.f17704e) {
            objectOutput.writeUTF(this.f17705f);
        }
    }
}
