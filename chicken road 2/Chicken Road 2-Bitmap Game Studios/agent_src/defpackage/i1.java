package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Function0 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ i1(int i, String str, EnumDescriptor enumDescriptor) {
        this.b41X89IqSbKt = i;
        this.gmXBnHsR2YSm = str;
        this.i7xAcZoXXiIt = enumDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj = this.i7xAcZoXXiIt;
        int i2 = this.b41X89IqSbKt;
        Object obj2 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                String str = (String) obj2;
                EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    String str2 = str + '.' + enumDescriptor.b41X89IqSbKt[i3];
                    SerialDescriptor[] serialDescriptorArr2 = new SerialDescriptor[0];
                    if (StringsKt.GiTAvmtrM6Bh8SJ(str2)) {
                        yzPsTade5rL7D3.yRx9jbDCTnXb3("Blank serial names are prohibited");
                    } else {
                        StructureKind.CLASS r6 = StructureKind.CLASS.yzPsTade5rL7D3;
                        StructureKind.OBJECT object = StructureKind.OBJECT.yzPsTade5rL7D3;
                        if (object != r6) {
                            ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder(str2);
                            serialDescriptorArr[i3] = new SerialDescriptorImpl(str2, object, classSerialDescriptorBuilder.hRNgd2zGCE5kj.size(), ArraysKt.BD2CRjLJ8EtOqGQ(serialDescriptorArr2), classSerialDescriptorBuilder);
                        } else {
                            yzPsTade5rL7D3.yRx9jbDCTnXb3("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                        }
                    }
                    return null;
                }
                return serialDescriptorArr;
            default:
                Http2Connection http2Connection = (Http2Connection) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                Settings settings = Http2Connection.Yey4RyhSyBRHub;
                try {
                    http2Connection.BD2CRjLJ8EtOqGQ.OcGJUxcOVecQiKb(i2, errorCode);
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.i7xAcZoXXiIt;
                    http2Connection.yzPsTade5rL7D3(errorCode2, errorCode2, e);
                }
                return Unit.yzPsTade5rL7D3;
        }
    }

    public /* synthetic */ i1(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        this.gmXBnHsR2YSm = http2Connection;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = errorCode;
    }
}
