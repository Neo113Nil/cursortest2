package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0016\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,Bk\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b+\u0010-B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b+\u0010/B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b+\u00100B§\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b+\u00101B±\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b+\u00102B¿\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b+\u00103BÍ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b+\u00104BÏ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b+\u00105B×\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r¢\u0006\u0004\b+\u00106J\u0017\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0019H\u0017¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u0019H\u0016¢\u0006\u0004\b<\u0010=J\u009d\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0002\u0010&\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010HR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010ER\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ER\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010LR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010MR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010NR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010DR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010DR\u0014\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010ER\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010OR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010PR\u0014\u0010.\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010ER\"\u0010Q\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010["}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqliteOpenHelperFactory", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "prepackagedDatabaseCallback", "typeConverters", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Landroidx/sqlite/SQLiteDriver;", "sqliteDriver", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;ZLandroidx/sqlite/SQLiteDriver;Lkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "multiInstanceInvalidation", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;Z)V", "version", "isMigrationRequiredFrom", "(I)Z", "fromVersion", "toVersion", "isMigrationRequired", "(II)Z", "copy", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;ZLandroidx/sqlite/SQLiteDriver;Lkotlin/coroutines/CoroutineContext;)Landroidx/room/DatabaseConfiguration;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/room/RoomDatabase$MigrationContainer;", "Ljava/util/List;", "Z", "Landroidx/room/RoomDatabase$JournalMode;", "Ljava/util/concurrent/Executor;", "Landroid/content/Intent;", "Ljava/util/Set;", "getMigrationNotRequiredFrom$room_runtime", "()Ljava/util/Set;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "Landroidx/sqlite/SQLiteDriver;", "Lkotlin/coroutines/CoroutineContext;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime", "()Z", "setUseTempTrackingTable$room_runtime", "(Z)V", "preparedStatementCacheSize", com.visa.cbp.getEncExpo.warmup, "getPreparedStatementCacheSize$room_runtime", "()I", "setPreparedStatementCacheSize$room_runtime", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationForAllTables;
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final java.util.List<androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs;
    public final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;
    public final android.content.Context context;
    public final java.lang.String copyFromAssetPath;
    public final java.io.File copyFromFile;
    public final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;
    public final androidx.room.RoomDatabase.JournalMode journalMode;
    public final androidx.room.RoomDatabase.MigrationContainer migrationContainer;
    private final java.util.Set<java.lang.Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;
    public final android.content.Intent multiInstanceInvalidationServiceIntent;
    public final java.lang.String name;
    public final androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    private int preparedStatementCacheSize;
    public final kotlin.coroutines.CoroutineContext queryCoroutineContext;
    public final java.util.concurrent.Executor queryExecutor;
    public final boolean requireMigration;
    public final androidx.database.SQLiteDriver sqliteDriver;
    public final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final java.util.concurrent.Executor transactionExecutor;
    public final java.util.List<java.lang.Object> typeConverters;
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z2, boolean z3, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> list2, java.util.List<? extends androidx.room.migration.AutoMigrationSpec> list3, boolean z4, androidx.database.SQLiteDriver sQLiteDriver, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = list2;
        this.autoMigrationSpecs = list3;
        this.allowDestructiveMigrationForAllTables = z4;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
        this.preparedStatementCacheSize = 25;
    }

    public final java.util.Set<java.lang.Integer> getMigrationNotRequiredFrom$room_runtime() {
        return this.migrationNotRequiredFrom;
    }

    /* renamed from: getUseTempTrackingTable$room_runtime, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, boolean z2, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor, null, z2, false, set, null, null, null, null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, null, null, null, null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, null, null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> list2) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, list2, kotlin.collections.CollectionsKt.emptyList(), false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> list2, java.util.List<? extends androidx.room.migration.AutoMigrationSpec> list3) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, null, list2, list3, false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z2, boolean z3, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> list2, java.util.List<? extends androidx.room.migration.AutoMigrationSpec> list3) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, null, list2, list3, false, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "This constructor is deprecated.")
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z2, boolean z3, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> list2, java.util.List<? extends androidx.room.migration.AutoMigrationSpec> list3, boolean z4) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, null, list2, list3, z4, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
    }

    @kotlin.Deprecated(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @kotlin.ReplaceWith(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int version) {
        return isMigrationRequired(version, version + 1);
    }

    /* renamed from: getPreparedStatementCacheSize$room_runtime, reason: from getter */
    public final int getPreparedStatementCacheSize() {
        return this.preparedStatementCacheSize;
    }

    public final void setPreparedStatementCacheSize$room_runtime(int i) {
        this.preparedStatementCacheSize = i;
    }

    public boolean isMigrationRequired(int fromVersion, int toVersion) {
        return androidx.room.util.MigrationUtil.isMigrationRequired(this, fromVersion, toVersion);
    }

    public static /* synthetic */ androidx.room.DatabaseConfiguration copy$default(androidx.room.DatabaseConfiguration databaseConfiguration, android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z2, boolean z3, java.util.Set set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List list2, java.util.List list3, boolean z4, androidx.database.SQLiteDriver sQLiteDriver, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if (obj == null) {
            return databaseConfiguration.copy((i & 1) != 0 ? databaseConfiguration.context : context, (i & 2) != 0 ? databaseConfiguration.name : str, (i & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory, (i & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer, (i & 16) != 0 ? databaseConfiguration.callbacks : list, (i & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z, (i & 64) != 0 ? databaseConfiguration.journalMode : journalMode, (i & 128) != 0 ? databaseConfiguration.queryExecutor : executor, (i & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2, (i & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent, (i & 1024) != 0 ? databaseConfiguration.requireMigration : z2, (i & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z3, (i & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set, (i & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2, (i & 16384) != 0 ? databaseConfiguration.copyFromFile : file, (i & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable, (i & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback, (i & 131072) != 0 ? databaseConfiguration.typeConverters : list2, (i & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3, (i & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z4, (i & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver, (i & 2097152) != 0 ? databaseConfiguration.queryCoroutineContext : coroutineContext);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final androidx.room.DatabaseConfiguration copy(android.content.Context context, java.lang.String name2, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<? extends androidx.room.RoomDatabase.Callback> callbacks, boolean allowMainThreadQueries, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor queryExecutor, java.util.concurrent.Executor transactionExecutor, android.content.Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, java.util.Set<java.lang.Integer> migrationNotRequiredFrom, java.lang.String copyFromAssetPath, java.io.File copyFromFile, java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<? extends java.lang.Object> typeConverters, java.util.List<? extends androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, androidx.database.SQLiteDriver sqliteDriver, kotlin.coroutines.CoroutineContext queryCoroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConverters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoMigrationSpecs, "");
        androidx.room.DatabaseConfiguration databaseConfiguration = new androidx.room.DatabaseConfiguration(context, name2, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
        databaseConfiguration.useTempTrackingTable = this.useTempTrackingTable;
        databaseConfiguration.preparedStatementCacheSize = this.preparedStatementCacheSize;
        return databaseConfiguration;
    }
}
