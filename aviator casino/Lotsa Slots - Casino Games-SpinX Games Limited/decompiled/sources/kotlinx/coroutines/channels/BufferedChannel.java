package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004ì\u0001í\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\"J4\u0010$\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010(J\"\u0010)\u001a\u00020\u0007*\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J#\u0010+\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0002¢\u0006\u0002\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00192\u0006\u0010!\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b4\u0010\"Jê\u0001\u00105\u001a\u0002H6\"\u0004\b\u0001\u001062\u0006\u0010!\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u0001082\f\u00109\u001a\b\u0012\u0004\u0012\u0002H60:2<\u0010;\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0004\u0012\u0002H60<2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H60:2h\b\u0002\u0010B\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H60CH\u0082\b¢\u0006\u0002\u0010DJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010!\u001a\u00028\u0000H\u0004¢\u0006\u0004\bF\u00102JX\u0010G\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\u0006\u00107\u001a\u00020*2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070:2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070:H\u0082\b¢\u0006\u0002\u0010HJE\u0010I\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010KJE\u0010L\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010KJ\u0010\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0010H\u0003J\u0010\u0010O\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0010H\u0002J\r\u0010M\u001a\u00020\u0019H\u0010¢\u0006\u0002\bQJ\u0019\u0010R\u001a\u00020\u0019*\u0002082\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010SJ\b\u0010T\u001a\u00020\u0007H\u0014J\b\u0010U\u001a\u00020\u0007H\u0014J\u000e\u0010V\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010WJ,\u0010X\u001a\u00028\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010ZJ\"\u0010[\u001a\u00020\u0007*\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0016\u0010\\\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0004\b^\u0010WJ4\u0010_\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b`\u0010ZJ\u001c\u0010a\u001a\u00020\u00072\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000-H\u0002J\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0010H\u0004J÷\u0001\u0010g\u001a\u0002H6\"\u0004\b\u0001\u001062\b\u00107\u001a\u0004\u0018\u0001082!\u0010h\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H60\u00062Q\u0010;\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(Y\u0012\u0004\u0012\u0002H60i2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H60:2S\b\u0002\u0010B\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(Y\u0012\u0004\u0012\u0002H60iH\u0082\b¢\u0006\u0002\u0010jJ`\u0010k\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\u0006\u00107\u001a\u00020*2!\u0010h\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070:H\u0082\bJ2\u0010l\u001a\u0004\u0018\u0001082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0002J2\u0010m\u001a\u0004\u0018\u0001082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0002J\"\u0010n\u001a\u00020\u0019*\u0002082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J&\u0010p\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0010H\u0002J&\u0010r\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0010H\u0002J\u0012\u0010s\u001a\u00020\u00072\b\b\u0002\u0010t\u001a\u00020\u0010H\u0002J\u0015\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u00020\u0010H\u0000¢\u0006\u0002\bwJ\u001f\u0010~\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\b\u0010!\u001a\u0004\u0018\u000108H\u0014J$\u0010\u0081\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u00002\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u0001H\u0002¢\u0006\u0003\u0010\u0082\u0001J!\u0010\u0083\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0091\u0001\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u000108H\u0002J\u0016\u0010\u0092\u0001\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u0001H\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0094\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0095\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J\u0011\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009e\u0001H\u0096\u0002J\t\u0010¨\u0001\u001a\u00020\u0007H\u0014J\u0015\u0010©\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\u0013\u0010«\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001J\u0007\u0010«\u0001\u001a\u00020\u0007J \u0010«\u0001\u001a\u00020\u00072\u0011\u0010ª\u0001\u001a\f\u0018\u00010¬\u0001j\u0005\u0018\u0001`\u00ad\u0001¢\u0006\u0003\u0010®\u0001J\u001b\u0010¯\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0010¢\u0006\u0003\b°\u0001J\u001e\u0010±\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010«\u0001\u001a\u00020\u0019H\u0014J\t\u0010²\u0001\u001a\u00020\u0007H\u0002J1\u0010³\u0001\u001a\u00020\u00072&\u0010´\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\u0099\u0001¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(ª\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\t\u0010µ\u0001\u001a\u00020\u0007H\u0002J\t\u0010¶\u0001\u001a\u00020\u0007H\u0002J\t\u0010·\u0001\u001a\u00020\u0007H\u0002J\t\u0010¸\u0001\u001a\u00020\u0007H\u0002J\u0018\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0007\u0010»\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010¼\u0001\u001a\u00020\u00072\u0007\u0010»\u0001\u001a\u00020\u0010H\u0002J\u000f\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0018\u0010¾\u0001\u001a\u00020\u00102\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0018\u0010À\u0001\u001a\u00020\u00072\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J \u0010Á\u0001\u001a\u00020\u00072\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\r\u0010Â\u0001\u001a\u00020\u0007*\u00020*H\u0002J\r\u0010Ã\u0001\u001a\u00020\u0007*\u00020*H\u0002J\u0016\u0010Ä\u0001\u001a\u00020\u0007*\u00020*2\u0007\u0010Å\u0001\u001a\u00020\u0019H\u0002J\u001b\u0010Í\u0001\u001a\u00020\u00192\u0007\u0010Î\u0001\u001a\u00020\u00102\u0007\u0010Ê\u0001\u001a\u00020\u0019H\u0002J\u000f\u0010Ñ\u0001\u001a\u00020\u0019H\u0000¢\u0006\u0003\bÒ\u0001J'\u0010Ó\u0001\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010v\u001a\u00020\u0010H\u0002J)\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J)\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J2\u0010Ø\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0007\u0010Ù\u0001\u001a\u00020\u0010H\u0002J!\u0010Ú\u0001\u001a\u00020\u00072\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0012\u0010Û\u0001\u001a\u00020\u00072\u0007\u0010Ü\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ý\u0001\u001a\u00020\u00072\u0007\u0010Ü\u0001\u001a\u00020\u0010H\u0002J\n\u0010Þ\u0001\u001a\u00030ß\u0001H\u0016J\u0010\u0010à\u0001\u001a\u00030ß\u0001H\u0000¢\u0006\u0003\bá\u0001J\u0007\u0010â\u0001\u001a\u00020\u0007JD\u0010ã\u0001\u001a#\u0012\u0005\u0012\u00030\u0099\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070ä\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0002J4\u0010å\u0001\u001a\u00020\u00072\b\u0010ª\u0001\u001a\u00030\u0099\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u0000002\b\u0010æ\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\bç\u0001\u0010è\u0001JM\u0010é\u0001\u001a\u001e\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070i*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\b2\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010ê\u0001J>\u0010é\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070ä\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0002J+\u0010ë\u0001\u001a\u00020\u00072\b\u0010ª\u0001\u001a\u00030\u0099\u00012\u0006\u0010!\u001a\u00028\u00002\b\u0010æ\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0003\u0010è\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\t\u0010\u000e\u001a\u00020\fX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\t\u0010\u0017\u001a\u00020\fX\u0082\u0004R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R\u0015\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R,\u0010x\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000y8VX\u0096\u0004¢\u0006\f\u0012\u0004\bz\u0010{\u001a\u0004\b|\u0010}R%\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0088\u0001\u0010{\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R+\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008c\u0001\u0010{\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R'\u0010\u008e\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010{\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R\u008b\u0001\u0010\u0096\u0001\u001aw\u0012\u0018\u0012\u0016\u0012\u0002\b\u00030\u0080\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u007f\u0012\u0016\u0012\u0014\u0018\u000108¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(\u0097\u0001\u0012\u0016\u0012\u0014\u0018\u000108¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(\u0098\u0001\u0012 \u0012\u001e\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070i\u0018\u00010ij\u0005\u0018\u0001`\u009b\u0001X\u0082\u0004¢\u0006\t\n\u0000\u0012\u0005\b\u009c\u0001\u0010{R\u0012\u0010\u009f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u001cX\u0082\u0004R\u001a\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010£\u0001\u001a\u00030\u0099\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00030\u0099\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¢\u0001R\u0012\u0010§\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u001cX\u0082\u0004R\u0016\u0010¹\u0001\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\u001aR\u001d\u0010Æ\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÇ\u0001\u0010{\u001a\u0005\bÆ\u0001\u0010\u001aR\u001b\u0010È\u0001\u001a\u00020\u0019*\u00020\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001d\u0010Ê\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bË\u0001\u0010{\u001a\u0005\bÊ\u0001\u0010\u001aR\u001b\u0010Ì\u0001\u001a\u00020\u0019*\u00020\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010É\u0001R\u001d\u0010Ï\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÐ\u0001\u0010{\u001a\u0005\bÏ\u0001\u0010\u001a¨\u0006î\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "sendersAndCloseStatus", "Lkotlinx/atomicfu/AtomicLong;", "receivers", "bufferEnd", "sendersCounter", "", "getSendersCounter$kotlinx_coroutines_core", "()J", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "bufferEndCounter", "getBufferEndCounter", "completedExpandBuffersAndPauseFlag", "isRendezvousOrUnlimited", "", "()Z", "sendSegment", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "receiveSegment", "bufferEndSegment", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSend", "sendOnNoWaiterSuspend", com.ironsource.D1.i, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareSenderForSuspension", "Lkotlinx/coroutines/Waiter;", "onClosedSendOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "R", "waiter", "", "onRendezvousOrBuffered", "Lkotlin/Function0;", "onSuspend", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "segm", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "onClosed", "onNoWaiterSuspend", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "shouldSendSuspend", "curSendersAndCloseStatus", "bufferOrRendezvousSend", "curSenders", "shouldSendSuspend$kotlinx_coroutines_core", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOnNoWaiterSuspend", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "onClosedReceiveCatchingOnNoWaiterSuspend", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "receiveImpl", "onElementRetrieved", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "updateCellReceive", "updateCellReceiveSlow", "tryResumeSender", "expandBuffer", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "incCompletedExpandBufferAttempts", "nAttempts", "waitExpandBufferCompletion", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "()V", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectSend", "ignoredParam", "selectResult", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "registerSelectForReceive", "onClosedSelectOnReceive", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "onUndeliveredElementReceiveCancellationConstructor", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "_closeCause", "closeCause", "getCloseCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "receiveException", "getReceiveException", "closeHandler", "onClosedIdempotent", "close", "cause", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "closeOrCancelImpl", "invokeCloseHandler", "invokeOnClose", "handler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "isConflatedDropOldest", "completeClose", "sendersCur", "completeCancel", "closeLinkedList", "markAllEmptyCellsAsClosed", "lastSegment", "removeUnprocessedElements", "cancelSuspendedReceiveRequests", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "isClosedForSend", "isClosedForSend$annotations", "isClosedForSend0", "(J)Z", "isClosedForReceive", "isClosedForReceive$annotations", "isClosedForReceive0", "isClosed", "sendersAndCloseStatusCur", "isEmpty", "isEmpty$annotations", "hasElements", "hasElements$kotlinx_coroutines_core", "isCellNonEmpty", "findSegmentSend", "id", "startFrom", "findSegmentReceive", "findSegmentBufferEnd", "currentBufferEndCounter", "moveSegmentBufferEndToSpecifiedOrLast", "updateSendersCounterIfLower", "value", "updateReceiversCounterIfLower", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "checkSegmentStructureInvariants", "bindCancellationFunResult", "Lkotlin/reflect/KFunction3;", "onCancellationChannelResultImplDoNotCall", "context", "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "bindCancellationFun", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "onCancellationImplDoNotCall", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.Channel<E> {
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater receivers$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater bufferEnd$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater sendSegment$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "sendSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater receiveSegment$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _closeCause$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "_closeCause$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater closeHandler$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "closeHandler$volatile");

    private final /* synthetic */ java.lang.Object getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> function1) {
        java.lang.Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
        return obj2;
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final /* synthetic */ java.lang.Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ java.lang.Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    private final /* synthetic */ java.lang.Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ java.lang.Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ java.lang.Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(java.lang.Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j) {
        this.bufferEnd$volatile = j;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(java.lang.Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(java.lang.Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j) {
        this.completedExpandBuffersAndPauseFlag$volatile = j;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(java.lang.Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j) {
        this.receivers$volatile = j;
    }

    private final /* synthetic */ void setSendSegment$volatile(java.lang.Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j) {
        this.sendersAndCloseStatus$volatile = j;
    }

    private final /* synthetic */ void set_closeCause$volatile(java.lang.Object obj) {
        this._closeCause$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, function1.invoke(java.lang.Long.valueOf(j)).longValue()));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo12310receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        return m12308receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return send$suspendImpl(this, e, continuation);
    }

    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        long initialBufferEnd;
        kotlinx.coroutines.internal.Symbol symbol;
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            initialBufferEnd = kotlinx.coroutines.channels.BufferedChannelKt.initialBufferEnd(i);
            this.bufferEnd$volatile = initialBufferEnd;
            this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
            kotlinx.coroutines.channels.ChannelSegment channelSegment = new kotlinx.coroutines.channels.ChannelSegment(0L, null, this, 3);
            this.sendSegment$volatile = channelSegment;
            this.receiveSegment$volatile = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
                kotlin.jvm.internal.Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.jvm.functions.Function3 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56;
                    onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56 = kotlinx.coroutines.channels.BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(kotlinx.coroutines.channels.BufferedChannel.this, (kotlinx.coroutines.selects.SelectInstance) obj, obj2, obj3);
                    return onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56;
                }
            } : null;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE;
            this._closeCause$volatile = symbol;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    public /* synthetic */ BufferedChannel(int i, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return kotlinx.coroutines.channels.Channel.DefaultImpls.offer(this, e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) kotlinx.coroutines.channels.Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    static /* synthetic */ <E> java.lang.Object send$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    java.lang.Object onClosedSend = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend;
                    }
                }
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, null, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    java.lang.Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i, e, j, continuation);
                    if (sendOnNoWaiterSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return sendOnNoWaiterSuspend;
                    }
                } else if (updateCellSend == 4) {
                    if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    java.lang.Object onClosedSend2 = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend2;
                    }
                } else if (updateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
            } else if (!isClosedForSend0) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    throw new java.lang.AssertionError();
                }
            } else {
                channelSegment.onSlotCleaned();
                java.lang.Object onClosedSend3 = bufferedChannel.onClosedSend(e, continuation);
                if (onClosedSend3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return onClosedSend3;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cont) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, cont.getContext());
        }
        kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation = cont;
        java.lang.Throwable sendException = getSendException();
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(sendException, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(sendException)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo10716trySendJP2dKIU(E element) {
        java.lang.Object obj;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12332failurePtdJZtk();
        }
        obj = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                }
                channelSegment.onSlotCleaned();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12332failurePtdJZtk();
            }
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getSendException());
    }

    /* compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", com.ironsource.D1.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class SendBroadcast implements kotlinx.coroutines.Waiter {
        private final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> $$delegate_0;
        private final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (kotlinx.coroutines.CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getCont() {
            return this.cont;
        }
    }

    static /* synthetic */ java.lang.Object sendImpl$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj3) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        kotlin.jvm.functions.Function4 function42 = (i & 32) != 0 ? new kotlin.jvm.functions.Function4() { // from class: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                return invoke((kotlinx.coroutines.channels.ChannelSegment<int>) obj4, ((java.lang.Number) obj5).intValue(), (int) obj6, ((java.lang.Number) obj7).longValue());
            }

            public final java.lang.Void invoke(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2, int i2, E e, long j) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
        } : function4;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return function02.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i2, obj, j, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            }
            if (updateCellSend == 1) {
                return function0.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return function02.invoke();
                }
                kotlinx.coroutines.Waiter waiter = obj2 instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                return function2.invoke(channelSegment, java.lang.Integer.valueOf(i2));
            }
            if (updateCellSend == 3) {
                return function42.invoke(channelSegment, java.lang.Integer.valueOf(i2), obj, java.lang.Long.valueOf(j));
            }
            if (updateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return function02.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    private final <R> R sendImpl(E element, java.lang.Object waiter, kotlin.jvm.functions.Function0<? extends R> onRendezvousOrBuffered, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? extends R> onSuspend, kotlin.jvm.functions.Function0<? extends R> onClosed, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super E, ? super java.lang.Long, ? extends R> onNoWaiterSuspend) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return onClosed.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, waiter, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 1) {
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return onClosed.invoke();
                }
                kotlinx.coroutines.Waiter waiter2 = waiter instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareSenderForSuspension(waiter2, channelSegment, i);
                }
                return onSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i));
            }
            if (updateCellSend == 3) {
                return onNoWaiterSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), element, java.lang.Long.valueOf(j));
            }
            if (updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return onClosed.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final java.lang.Object m12312trySendDropOldestJP2dKIU(E element) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.Object obj = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(kotlin.Unit.INSTANCE);
            }
            if (updateCellSend == 1) {
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(kotlin.Unit.INSTANCE);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getSendException());
                }
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i);
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(kotlin.Unit.INSTANCE);
            }
            if (updateCellSend == 3) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getSendException());
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    private final void sendImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, kotlinx.coroutines.Waiter waiter, kotlin.jvm.functions.Function0<kotlin.Unit> onRendezvousOrBuffered, kotlin.jvm.functions.Function0<kotlin.Unit> onClosed) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlin.Unit unit;
        kotlinx.coroutines.Waiter waiter2 = waiter;
        int updateCellSend = updateCellSend(segment, index, element, s, waiter, false);
        if (updateCellSend == 0) {
            segment.cleanPrev();
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (updateCellSend == 1) {
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (updateCellSend == 2) {
            prepareSenderForSuspension(waiter2, segment, index);
            return;
        }
        if (updateCellSend == 4) {
            if (s < getReceiversCounter$kotlinx_coroutines_core()) {
                segment.cleanPrev();
            }
            onClosed.invoke();
            return;
        }
        if (updateCellSend == 5) {
            segment.cleanPrev();
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
            while (true) {
                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                long j = andIncrement & 1152921504606846975L;
                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                    if (findSegmentSend != null) {
                        channelSegment = findSegmentSend;
                    } else if (isClosedForSend0) {
                        unit = onClosed.invoke();
                        break;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                kotlinx.coroutines.channels.ChannelSegment channelSegment3 = channelSegment;
                int updateCellSend2 = updateCellSend(channelSegment, i, element, j, waiter, isClosedForSend0);
                if (updateCellSend2 == 0) {
                    channelSegment3.cleanPrev();
                    unit = onRendezvousOrBuffered.invoke();
                    break;
                }
                if (updateCellSend2 == 1) {
                    unit = onRendezvousOrBuffered.invoke();
                    break;
                }
                if (updateCellSend2 != 2) {
                    if (updateCellSend2 == 3) {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                    if (updateCellSend2 != 4) {
                        if (updateCellSend2 == 5) {
                            channelSegment3.cleanPrev();
                        }
                        channelSegment2 = channelSegment3;
                    } else {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment3.cleanPrev();
                        }
                        unit = onClosed.invoke();
                    }
                } else if (isClosedForSend0) {
                    channelSegment3.onSlotCleaned();
                    unit = onClosed.invoke();
                } else {
                    if (!(waiter2 instanceof kotlinx.coroutines.Waiter)) {
                        waiter2 = null;
                    }
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment3, i);
                    }
                    unit = kotlin.Unit.INSTANCE;
                }
            }
            return;
        }
        throw new java.lang.IllegalStateException("unexpected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, java.lang.Object waiter, boolean closed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s, waiter, closed);
        }
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                segment.setState$kotlinx_coroutines_core(index, symbol3);
                onReceiveDequeued();
                return 0;
            }
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
            java.lang.Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol);
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
            if (andSetState$kotlinx_coroutines_core != symbol2) {
                segment.onCancelledRequest(index, true);
            }
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s, waiter, closed);
    }

    private final int updateCellSendSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, java.lang.Object waiter, boolean closed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core != symbol3) {
                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol4) {
                            segment.cleanElement$kotlinx_coroutines_core(index);
                            return 5;
                        }
                        if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            segment.cleanElement$kotlinx_coroutines_core(index);
                            completeCloseOrCancel();
                            return 4;
                        }
                        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                            throw new java.lang.AssertionError();
                        }
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                            state$kotlinx_coroutines_core = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter;
                        }
                        if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                            symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                            segment.setState$kotlinx_coroutines_core(index, symbol7);
                            onReceiveDequeued();
                            return 0;
                        }
                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                        java.lang.Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol5);
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                        if (andSetState$kotlinx_coroutines_core != symbol6) {
                            segment.onCancelledRequest(index, true);
                        }
                        return 5;
                    }
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    return 5;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(s) || closed) {
                if (closed) {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                    if (segment.casState$kotlinx_coroutines_core(index, null, symbol)) {
                        segment.onCancelledRequest(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (segment.casState$kotlinx_coroutines_core(index, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    private final boolean tryResumeReceiver(java.lang.Object obj, E e) {
        boolean tryResume0;
        boolean tryResume02;
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            return ((kotlinx.coroutines.selects.SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof kotlinx.coroutines.channels.ReceiveCatching) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl = ((kotlinx.coroutines.channels.ReceiveCatching) obj).cont;
            kotlinx.coroutines.channels.ChannelResult m12318boximpl = kotlinx.coroutines.channels.ChannelResult.m12318boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(e));
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
            tryResume02 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuationImpl, m12318boximpl, (kotlin.jvm.functions.Function3) (function1 != null ? bindCancellationFunResult(function1) : null));
            return tryResume02;
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) obj).tryResumeHasNext(e);
        }
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) obj;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
            tryResume0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuation, e, (kotlin.jvm.functions.Function3) (function12 != null ? bindCancellationFun(function12) : null));
            return tryResume0;
        }
        throw new java.lang.IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static /* synthetic */ <E> java.lang.Object receive$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return updateCellReceive;
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
        }
        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super E> cont) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cont.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(getReceiveException())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> java.lang.Object m12308receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) continuation;
            if ((bufferedChannel$receiveCatching$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label -= Integer.MIN_VALUE;
                kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                java.lang.Object obj = bufferedChannel$receiveCatching$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bufferedChannel$receiveCatching$12.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                    int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment.id != j) {
                        kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    }
                    java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    if (updateCellReceive != symbol) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                        if (updateCellReceive != symbol2) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                            if (updateCellReceive == symbol3) {
                                bufferedChannel$receiveCatching$12.label = 1;
                                java.lang.Object m12309receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel.m12309receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i2, andIncrement, bufferedChannel$receiveCatching$12);
                                return m12309receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : m12309receiveCatchingOnNoWaiterSuspendGKJJFZk;
                            }
                            channelSegment.cleanPrev();
                            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(updateCellReceive);
                        }
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                    } else {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                }
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        java.lang.Object obj2 = bufferedChannel$receiveCatching$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bufferedChannel$receiveCatching$122.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m12309receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.channels.ChannelResult m12318boximpl;
        kotlin.jvm.functions.Function3 function3;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            if ((bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
                    kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12));
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching = new kotlinx.coroutines.channels.ReceiveCatching(orCreateCancellableContinuation);
                        java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                        if (updateCellReceive != symbol) {
                            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            if (updateCellReceive == symbol2) {
                                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                        break;
                                    }
                                    long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                                    long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                    int i3 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                    if (channelSegment2.id != j2) {
                                        kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                                        if (findSegmentReceive != null) {
                                            channelSegment2 = findSegmentReceive;
                                        }
                                    }
                                    java.lang.Object updateCellReceive2 = updateCellReceive(channelSegment2, i3, andIncrement, receiveCatching);
                                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                                    if (updateCellReceive2 != symbol3) {
                                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                        if (updateCellReceive2 != symbol4) {
                                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                            if (updateCellReceive2 == symbol5) {
                                                throw new java.lang.IllegalStateException("unexpected".toString());
                                            }
                                            channelSegment2.cleanPrev();
                                            m12318boximpl = kotlinx.coroutines.channels.ChannelResult.m12318boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(updateCellReceive2));
                                            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                                            function3 = (kotlin.jvm.functions.Function3) (function1 != null ? bindCancellationFunResult(function1) : null);
                                        } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    } else {
                                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching2 = receiveCatching instanceof kotlinx.coroutines.Waiter ? receiveCatching : null;
                                        if (receiveCatching2 != null) {
                                            prepareReceiverForSuspension(receiveCatching2, channelSegment2, i3);
                                        }
                                    }
                                }
                            } else {
                                channelSegment.cleanPrev();
                                m12318boximpl = kotlinx.coroutines.channels.ChannelResult.m12318boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(updateCellReceive));
                                kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
                                function3 = (kotlin.jvm.functions.Function3) (function12 != null ? bindCancellationFunResult(function12) : null);
                            }
                            orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) m12318boximpl, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) function3);
                        } else {
                            prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                        }
                        obj = orCreateCancellableContinuation.getResult();
                        if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0;
                    int i4 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        java.lang.Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i2 != 0) {
        }
        return ((kotlinx.coroutines.channels.ChannelResult) obj2).getHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> cont) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cont.resumeWith(kotlin.Result.m10798constructorimpl(kotlinx.coroutines.channels.ChannelResult.m12318boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getCloseCause()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public java.lang.Object mo12311tryReceivePtdJZtk() {
        java.lang.Object obj;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        long j = receivers$volatile$FU.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            obj = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
            while (!isClosedForReceive()) {
                long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                long j3 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j3) {
                    kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, obj);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                if (updateCellReceive != symbol) {
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    if (updateCellReceive != symbol2) {
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive == symbol3) {
                            throw new java.lang.IllegalStateException("unexpected".toString());
                        }
                        channelSegment.cleanPrev();
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(updateCellReceive);
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegment, i);
                    }
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegment.onSlotCleaned();
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12332failurePtdJZtk();
                }
            }
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getCloseCause());
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12332failurePtdJZtk();
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isConflatedDropOldest()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j = receivers$volatile$FU.get(this);
            if (globalCellIndex < java.lang.Math.max(this.capacity + j, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j, j + 1)) {
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = findSegmentReceive(j2, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, null);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol) {
                    channelSegment.cleanPrev();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                } else if (j < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    static /* synthetic */ java.lang.Object receiveImpl$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function3 function32, int i, java.lang.Object obj2) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i & 16) != 0) {
            function32 = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return invoke((kotlinx.coroutines.channels.ChannelSegment) obj3, ((java.lang.Number) obj4).intValue(), ((java.lang.Number) obj5).longValue());
                }

                public final java.lang.Void invoke(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i2, long j) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
            };
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, obj);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        return function32.invoke(channelSegment, java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(andIncrement));
                    }
                    channelSegment.cleanPrev();
                    return function1.invoke(updateCellReceive);
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                return function3.invoke(channelSegment, java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(andIncrement));
            }
        }
        return function0.invoke();
    }

    private final <R> R receiveImpl(java.lang.Object waiter, kotlin.jvm.functions.Function1<? super E, ? extends R> onElementRetrieved, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> onSuspend, kotlin.jvm.functions.Function0<? extends R> onClosed, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> onNoWaiterSuspend) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            kotlinx.coroutines.internal.Symbol symbol4 = (java.lang.Object) updateCellReceive(channelSegment, i, andIncrement, waiter);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (symbol4 != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (symbol4 != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (symbol4 == symbol3) {
                        return onNoWaiterSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(andIncrement));
                    }
                    channelSegment.cleanPrev();
                    return onElementRetrieved.invoke(symbol4);
                }
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            } else {
                kotlinx.coroutines.Waiter waiter2 = waiter instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment, i);
                }
                return onSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(andIncrement));
            }
        }
        return onClosed.invoke();
    }

    private final void receiveImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, kotlinx.coroutines.Waiter waiter, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> onElementRetrieved, kotlin.jvm.functions.Function0<kotlin.Unit> onClosed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6 = (java.lang.Object) updateCellReceive(segment, index, r, waiter);
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
        if (symbol6 != symbol) {
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (symbol6 != symbol2) {
                segment.cleanPrev();
                onElementRetrieved.invoke(symbol6);
                return;
            }
            if (r < getSendersCounter$kotlinx_coroutines_core()) {
                segment.cleanPrev();
            }
            kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
            while (!isClosedForReceive()) {
                long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment.id != j) {
                    kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                kotlinx.coroutines.internal.Symbol symbol7 = (java.lang.Object) updateCellReceive(channelSegment, i, andIncrement, waiter);
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                if (symbol7 != symbol3) {
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    if (symbol7 != symbol4) {
                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (symbol7 == symbol5) {
                            throw new java.lang.IllegalStateException("unexpected".toString());
                        }
                        channelSegment.cleanPrev();
                        onElementRetrieved.invoke(symbol7);
                        return;
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    if (!(waiter instanceof kotlinx.coroutines.Waiter)) {
                        waiter = null;
                    }
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegment, i);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
            }
            onClosed.invoke();
            return;
        }
        prepareReceiverForSuspension(waiter, segment, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object updateCellReceive(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, java.lang.Object waiter) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                expandBuffer();
                return segment.retrieveElement$kotlinx_coroutines_core(index);
            }
        }
        return updateCellReceiveSlow(segment, index, r, waiter);
    }

    private final java.lang.Object updateCellReceiveSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, java.lang.Object waiter) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.internal.Symbol symbol8;
        kotlinx.coroutines.internal.Symbol symbol9;
        kotlinx.coroutines.internal.Symbol symbol10;
        kotlinx.coroutines.internal.Symbol symbol11;
        kotlinx.coroutines.internal.Symbol symbol12;
        kotlinx.coroutines.internal.Symbol symbol13;
        kotlinx.coroutines.internal.Symbol symbol14;
        kotlinx.coroutines.internal.Symbol symbol15;
        kotlinx.coroutines.internal.Symbol symbol16;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol6)) {
                            expandBuffer();
                            return segment.retrieveElement$kotlinx_coroutines_core(index);
                        }
                    } else {
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol8;
                        }
                        symbol9 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol10;
                        }
                        if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            symbol12 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != symbol12) {
                                symbol13 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol13)) {
                                    boolean z = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB;
                                    if (z) {
                                        state$kotlinx_coroutines_core = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter;
                                    }
                                    if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                                        symbol16 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                        segment.setState$kotlinx_coroutines_core(index, symbol16);
                                        expandBuffer();
                                        return segment.retrieveElement$kotlinx_coroutines_core(index);
                                    }
                                    symbol14 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                                    segment.setState$kotlinx_coroutines_core(index, symbol14);
                                    segment.onCancelledRequest(index, false);
                                    if (z) {
                                        expandBuffer();
                                    }
                                    symbol15 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                    return symbol15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            expandBuffer();
                            symbol11 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol11;
                        }
                    }
                }
            }
            if (r < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    expandBuffer();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    return symbol2;
                }
            } else {
                if (waiter == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    return symbol4;
                }
            }
        }
    }

    private final boolean tryResumeSender(java.lang.Object obj, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default((kotlinx.coroutines.CancellableContinuation) obj, kotlin.Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed = ((kotlinx.coroutines.selects.SelectImplementation) obj).trySelectDetailed(this, kotlin.Unit.INSTANCE);
            if (trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
            return kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) obj).getCont(), true, null, 2, null);
        }
        throw new java.lang.IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final boolean updateCellExpandBuffer(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long b) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && b >= receivers$volatile$FU.get(this)) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                if (!tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                    segment.setState$kotlinx_coroutines_core(index, symbol2);
                    segment.onCancelledRequest(index, false);
                    return false;
                }
                segment.setState$kotlinx_coroutines_core(index, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                return true;
            }
        }
        return updateCellExpandBufferSlow(segment, index, b);
    }

    private final boolean updateCellExpandBufferSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long b) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.internal.Symbol symbol8;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core != symbol3) {
                    if (state$kotlinx_coroutines_core == null) {
                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol4)) {
                            return true;
                        }
                    } else if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol5) {
                            break;
                        }
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                        if (state$kotlinx_coroutines_core == symbol6) {
                            break;
                        }
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                        if (state$kotlinx_coroutines_core == symbol7 || state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            return true;
                        }
                        symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                        if (state$kotlinx_coroutines_core != symbol8) {
                            throw new java.lang.IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else if (b >= receivers$volatile$FU.get(this)) {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    if (!tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        segment.setState$kotlinx_coroutines_core(index, symbol2);
                        segment.onCancelledRequest(index, false);
                        return false;
                    }
                    segment.setState$kotlinx_coroutines_core(index, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                    return true;
                }
            } else if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new kotlinx.coroutines.channels.WaiterEB((kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core))) {
                return true;
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, nAttempts) & com.google.common.primitives.Longs.MAX_POWER_OF_TWO) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & com.google.common.primitives.Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        int i;
        long j;
        long constructEBCompletedAndPauseFlag;
        long constructEBCompletedAndPauseFlag2;
        long j2;
        long constructEBCompletedAndPauseFlag3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= globalIndex) {
        }
        i = kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & kotlin.time.DurationKt.MAX_MILLIS) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            constructEBCompletedAndPauseFlag = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j & kotlin.time.DurationKt.MAX_MILLIS, true);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructEBCompletedAndPauseFlag));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            long j3 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            long j4 = j3 & kotlin.time.DurationKt.MAX_MILLIS;
            boolean z = (com.google.common.primitives.Longs.MAX_POWER_OF_TWO & j3) != 0;
            if (bufferEndCounter2 == j4 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            }
            if (!z) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
                constructEBCompletedAndPauseFlag2 = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j4, true);
                atomicLongFieldUpdater2.compareAndSet(this, j3, constructEBCompletedAndPauseFlag2);
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3 = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater3.get(this);
            constructEBCompletedAndPauseFlag3 = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & kotlin.time.DurationKt.MAX_MILLIS, false);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j2, constructEBCompletedAndPauseFlag3));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.BufferedChannel<E>> getOnSend() {
        kotlinx.coroutines.channels.BufferedChannel$onSend$1 bufferedChannel$onSend$1 = kotlinx.coroutines.channels.BufferedChannel$onSend$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onSend$2 bufferedChannel$onSend$2 = kotlinx.coroutines.channels.BufferedChannel$onSend$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    private final void onClosedSelectOnSend(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, select.getContext());
        }
        select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectSend(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
        kotlinx.coroutines.channels.BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = kotlinx.coroutines.channels.BufferedChannel$onReceive$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = kotlinx.coroutines.channels.BufferedChannel$onReceive$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    private final void onClosedSelectOnReceive(kotlinx.coroutines.selects.SelectInstance<?> select) {
        select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceive(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceiveOrNull(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceiveCatching(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        return kotlinx.coroutines.channels.ChannelResult.m12318boximpl(selectResult == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED() ? kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getCloseCause()) : kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(selectResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function3 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(final kotlinx.coroutines.channels.BufferedChannel bufferedChannel, final kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj, final java.lang.Object obj2) {
        return new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                kotlin.Unit onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
                onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55 = kotlinx.coroutines.channels.BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(obj2, bufferedChannel, selectInstance, (java.lang.Throwable) obj3, obj4, (kotlin.coroutines.CoroutineContext) obj5);
                return onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(java.lang.Object obj, kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Throwable th, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (obj != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
        return new kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator();
    }

    /* compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\n\u001a\u00020\tH\u0096B¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J,\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "receiveResult", "", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedHasNext", "hasNextOnNoWaiterSuspend", com.ironsource.D1.i, "Lkotlinx/coroutines/channels/ChannelSegment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "onClosedHasNextNoWaiterSuspend", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class BufferedChannelIterator implements kotlinx.coroutines.channels.ChannelIterator<E>, kotlinx.coroutines.Waiter {
        private kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> continuation;
        private java.lang.Object receiveResult;

        public BufferedChannelIterator() {
            kotlinx.coroutines.internal.Symbol symbol;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation continuation) {
            return kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.internal.Symbol symbol4;
            java.lang.Object obj = this.receiveResult;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            boolean z = true;
            if (obj == symbol || this.receiveResult == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.isClosedForReceive()) {
                        z = onClosedHasNext();
                        break;
                    }
                    long andIncrement = kotlinx.coroutines.channels.BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                    int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment.id != j) {
                        kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    }
                    java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    if (updateCellReceive != symbol2) {
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                        if (updateCellReceive != symbol3) {
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                            if (updateCellReceive == symbol4) {
                                return hasNextOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                            }
                            channelSegment.cleanPrev();
                            this.receiveResult = updateCellReceive;
                        } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                    } else {
                        throw new java.lang.IllegalStateException("unreachable".toString());
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object hasNextOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            java.lang.Boolean boxBoolean;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.internal.Symbol symbol4;
            kotlinx.coroutines.internal.Symbol symbol5;
            kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
            kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                if (updateCellReceive != symbol) {
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    kotlin.jvm.functions.Function3 function3 = null;
                    function3 = null;
                    if (updateCellReceive == symbol2) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = kotlinx.coroutines.channels.BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                            long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                            int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                            if (channelSegment2.id != j2) {
                                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                                if (findSegmentReceive != null) {
                                    channelSegment2 = findSegmentReceive;
                                }
                            }
                            java.lang.Object updateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i2, andIncrement, this);
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                            if (updateCellReceive2 != symbol3) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                if (updateCellReceive2 != symbol4) {
                                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                    if (updateCellReceive2 == symbol5) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    channelSegment2.cleanPrev();
                                    this.receiveResult = updateCellReceive2;
                                    this.continuation = null;
                                    boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = bufferedChannel.onUndeliveredElement;
                                    if (function1 != null) {
                                        function3 = bufferedChannel.bindCancellationFun(function1, updateCellReceive2);
                                    }
                                } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            } else {
                                kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator bufferedChannelIterator = this instanceof kotlinx.coroutines.Waiter ? this : null;
                                if (bufferedChannelIterator != null) {
                                    bufferedChannel.prepareReceiverForSuspension(bufferedChannelIterator, channelSegment2, i2);
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = bufferedChannel.onUndeliveredElement;
                        if (function12 != null) {
                            function3 = bufferedChannel.bindCancellationFun(function12, updateCellReceive);
                        }
                    }
                    orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) boxBoolean, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) function3);
                } else {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                }
                java.lang.Object result = orCreateCancellableContinuation.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (java.lang.Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m10798constructorimpl(false));
                return;
            }
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(closeCause)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            E e = (E) this.receiveResult;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
                this.receiveResult = symbol2;
                if (e != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return e;
                }
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(kotlinx.coroutines.channels.BufferedChannel.this.getReceiveException());
            }
            throw new java.lang.IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean tryResumeHasNext(E element) {
            boolean tryResume0;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = element;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = kotlinx.coroutines.channels.BufferedChannel.this.onUndeliveredElement;
            tryResume0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuationImpl2, true, function1 != null ? kotlinx.coroutines.channels.BufferedChannel.this.bindCancellationFun(function1, element) : null);
            return tryResume0;
        }

        public final void tryResumeHasNextOnClosedChannel() {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m10798constructorimpl(false));
                return;
            }
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(closeCause)));
        }
    }

    protected final java.lang.Throwable getCloseCause() {
        return (java.lang.Throwable) _closeCause$volatile$FU.get(this);
    }

    protected final java.lang.Throwable getSendException() {
        java.lang.Throwable closeCause = getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedSendChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Throwable getReceiveException() {
        java.lang.Throwable closeCause = getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(java.lang.Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(java.util.concurrent.CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
        if (cause == null) {
            cause = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    protected boolean closeOrCancelImpl(java.lang.Throwable cause, boolean cancel) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (cancel) {
            markCancellationStarted();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$volatile$FU;
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE;
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol, cause);
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (m) {
            invokeCloseHandler();
        }
        return m;
    }

    private final void invokeCloseHandler() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, obj == null ? kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED : kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((kotlin.jvm.functions.Function1) obj).invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(closeHandler$volatile$FU, this, null, handler)) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$volatile$FU;
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            if (obj != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                if (obj == symbol2) {
                    throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new java.lang.IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = closeHandler$volatile$FU;
            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        handler.invoke(getCloseCause());
    }

    private final void markClosed() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancellationStarted() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> completeClose(long sendersCur) {
        kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, sendersCur);
        return closeLinkedList;
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList() {
        java.lang.Object obj = bufferEndSegment$volatile$FU.get(this);
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.ConcurrentLinkedListKt.close((kotlinx.coroutines.internal.ConcurrentLinkedListNode) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r9 = (kotlinx.coroutines.channels.ChannelSegment) r9.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment) {
        kotlinx.coroutines.internal.Symbol symbol;
        do {
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i;
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    return -1L;
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                                return j;
                            }
                        }
                    }
                    if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        r13 = (kotlinx.coroutines.channels.ChannelSegment) r13.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException = null;
        java.lang.Object m12361constructorimpl$default = kotlinx.coroutines.internal.InlineList.m12361constructorimpl$default(null, 1, null);
        loop0: do {
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i;
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core == symbol2 || state$kotlinx_coroutines_core == null) {
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                lastSegment.onSlotCleaned();
                                break;
                            }
                        } else if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core == symbol3) {
                                break loop0;
                            }
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core == symbol4) {
                                break loop0;
                            }
                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != symbol5) {
                                break;
                            }
                        } else {
                            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            kotlinx.coroutines.Waiter waiter = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB ? ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter : (kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core;
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (function1 != null) {
                                    undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                                }
                                m12361constructorimpl$default = kotlinx.coroutines.internal.InlineList.m12366plusFjFbRPM(m12361constructorimpl$default, waiter);
                                lastSegment.cleanElement$kotlinx_coroutines_core(i);
                                lastSegment.onSlotCleaned();
                            }
                        }
                    } else {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (function1 != null) {
                                undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                            }
                            lastSegment.cleanElement$kotlinx_coroutines_core(i);
                            lastSegment.onSlotCleaned();
                        }
                    }
                }
                i--;
            }
        } while (lastSegment != null);
        if (m12361constructorimpl$default != null) {
            if (!(m12361constructorimpl$default instanceof java.util.ArrayList)) {
                resumeSenderOnCancelledChannel((kotlinx.coroutines.Waiter) m12361constructorimpl$default);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(m12361constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                java.util.ArrayList arrayList = (java.util.ArrayList) m12361constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((kotlinx.coroutines.Waiter) arrayList.get(size));
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment, long sendersCounter) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object m12361constructorimpl$default = kotlinx.coroutines.internal.InlineList.m12361constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m12361constructorimpl$default = kotlinx.coroutines.internal.InlineList.m12366plusFjFbRPM(m12361constructorimpl$default, ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            } else {
                                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                                    break;
                                }
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m12361constructorimpl$default = kotlinx.coroutines.internal.InlineList.m12366plusFjFbRPM(m12361constructorimpl$default, state$kotlinx_coroutines_core);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            lastSegment = (kotlinx.coroutines.channels.ChannelSegment) lastSegment.getPrev();
        }
        if (m12361constructorimpl$default != null) {
            if (!(m12361constructorimpl$default instanceof java.util.ArrayList)) {
                resumeReceiverOnClosedChannel((kotlinx.coroutines.Waiter) m12361constructorimpl$default);
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(m12361constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            java.util.ArrayList arrayList = (java.util.ArrayList) m12361constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((kotlinx.coroutines.Waiter) arrayList.get(size));
            }
        }
    }

    private final void resumeReceiverOnClosedChannel(kotlinx.coroutines.Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(kotlinx.coroutines.Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(kotlinx.coroutines.Waiter waiter, boolean z) {
        if (waiter instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
            kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont = ((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) waiter).getCont();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cont.resumeWith(kotlin.Result.m10798constructorimpl(false));
            return;
        }
        if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) waiter;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(z ? getReceiveException() : getSendException())));
        } else if (waiter instanceof kotlinx.coroutines.channels.ReceiveCatching) {
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl = ((kotlinx.coroutines.channels.ReceiveCatching) waiter).cont;
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(kotlin.Result.m10798constructorimpl(kotlinx.coroutines.channels.ChannelResult.m12318boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12331closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
            ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof kotlinx.coroutines.selects.SelectInstance) {
            ((kotlinx.coroutines.selects.SelectInstance) waiter).trySelect(this, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new java.lang.IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else if (i == 3) {
            completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
        } else {
            throw new java.lang.IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            long j = receiversCounter$kotlinx_coroutines_core / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (channelSegment.id == j || (channelSegment = findSegmentReceive(j, channelSegment)) != null) {
                channelSegment.cleanPrev();
                if (isCellNonEmpty(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((kotlinx.coroutines.channels.ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j) {
                return false;
            }
        }
    }

    private final boolean isCellNonEmpty(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long globalIndex) {
        java.lang.Object state$kotlinx_coroutines_core;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core == symbol3 || state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return false;
                    }
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        return false;
                    }
                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol5) {
                        return false;
                    }
                    symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                    if (state$kotlinx_coroutines_core == symbol6) {
                        return true;
                    }
                    symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                    return state$kotlinx_coroutines_core != symbol7 && globalIndex == getReceiversCounter$kotlinx_coroutines_core();
                }
            }
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol));
        expandBuffer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
        if (channelSegment.id > id) {
            updateSendersCounterIfLower(channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && id <= getBufferEndCounter() / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater2.get(this);
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = channelSegment;
                if (segment2.id >= channelSegment2.id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment2)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        if (channelSegment.id > id) {
            updateReceiversCounterIfLower(channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom, long currentBufferEndCounter) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(id, startFrom);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
        if (channelSegment.id > id) {
            if (bufferEnd$volatile$FU.compareAndSet(this, currentBufferEndCounter + 1, channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE)) {
                incCompletedExpandBufferAttempts((channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) - currentBufferEndCounter);
                return null;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2;
        while (startFrom.id < id && (channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) startFrom.getNext()) != null) {
            startFrom = channelSegment2;
        }
        while (true) {
            if (!startFrom.isRemoved() || (channelSegment = (kotlinx.coroutines.channels.ChannelSegment) startFrom.getNext()) == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3 = startFrom;
                    if (segment.id >= channelSegment3.id) {
                        return;
                    }
                    if (!channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, channelSegment3)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    } else if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                        channelSegment3.remove();
                    }
                }
            } else {
                startFrom = channelSegment;
            }
        }
    }

    private final void updateSendersCounterIfLower(long value) {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            long j2 = 1152921504606846975L & j;
            if (j2 >= value) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j2, (int) (j >> 60));
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void updateReceiversCounterIfLower(long value) {
        long j;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (j >= value) {
                return;
            }
        } while (!receivers$volatile$FU.compareAndSet(this, j, value));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d5, code lost:
    
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String toString() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.String str;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append("data=[");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: do {
            int i2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                long j3 = (channelSegment3.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i3;
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                java.lang.Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i3);
                java.lang.Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancellableContinuation) {
                    if (j3 < receiversCounter$kotlinx_coroutines_core && j3 >= sendersCounter$kotlinx_coroutines_core) {
                        str = "receive";
                    } else if (j3 < sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                        str = "send";
                    } else {
                        str = "cont";
                    }
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.SelectInstance) {
                    if (j3 < receiversCounter$kotlinx_coroutines_core && j3 >= sendersCounter$kotlinx_coroutines_core) {
                        str = "onReceive";
                    } else if (j3 < sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                        str = "onSend";
                    } else {
                        str = "select";
                    }
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
                    str = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                    str = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2)) {
                            if (state$kotlinx_coroutines_core != null) {
                                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol5)) {
                                            symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol6)) {
                                                symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol7) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                                    str = state$kotlinx_coroutines_core.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                    str = "resuming_sender";
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append("(" + str + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(str + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                i3++;
            }
        } while (channelSegment3 != null);
        if (kotlin.text.StringsKt.last(sb) == ',') {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toStringDebug$kotlinx_coroutines_core() {
        java.lang.String valueOf;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb.append("CLOSED,");
        } else if (i == 3) {
            sb.append("CANCELLED,");
        }
        sb.append("SEND_SEGM=" + kotlinx.coroutines.DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + kotlinx.coroutines.DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + kotlinx.coroutines.DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb.append("  ");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) next;
        do {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment3));
            sb2.append("=[");
            sb2.append(channelSegment3.isRemoved() ? "*" : "");
            sb2.append(channelSegment3.id);
            sb2.append(",prev=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getPrev();
            sb2.append(channelSegment4 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment4) : null);
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb.append(sb2.toString());
            int i2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i3);
                java.lang.Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancellableContinuation) {
                    valueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.SelectInstance) {
                    valueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                    valueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
                    valueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                    valueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    valueOf = java.lang.String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append(com.ironsource.X3.j.d + i3 + "]=(" + valueOf + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + element$kotlinx_coroutines_core + "),");
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("next=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment5 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
            sb3.append(channelSegment5 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment5) : null);
            sb3.append("]  ");
            sb.append(sb3.toString());
            channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
        } while (channelSegment3 != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2;
        if (isRendezvousOrUnlimited()) {
            java.lang.Object obj = bufferEndSegment$volatile$FU.get(this);
            channelSegment2 = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (obj != channelSegment2) {
                throw new java.lang.IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((kotlinx.coroutines.channels.ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((kotlinx.coroutines.channels.ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            throw new java.lang.IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) obj2;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment3 != channelSegment) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next;
        if (channelSegment4.getPrev() != 0) {
            throw new java.lang.IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment4.getNext() != 0) {
            S next3 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next3);
            if (((kotlinx.coroutines.channels.ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment4.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next4);
                if (((kotlinx.coroutines.channels.ChannelSegment) next4).getPrev() != channelSegment4) {
                    throw new java.lang.IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i3);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                    throw new java.lang.IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                                }
                            }
                            if (channelSegment4.getElement$kotlinx_coroutines_core(i3) != null) {
                                throw new java.lang.IllegalStateException("Check failed.");
                            }
                        }
                    }
                    if (channelSegment4.getElement$kotlinx_coroutines_core(i3) != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    i2++;
                }
            }
            if (i2 == kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE && channelSegment4 != receiveSegment$volatile$FU.get(this) && channelSegment4 != sendSegment$volatile$FU.get(this) && channelSegment4 != bufferEndSegment$volatile$FU.get(this)) {
                throw new java.lang.IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next5);
            channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.KFunction<kotlin.Unit> bindCancellationFunResult(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        return new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m12307onCancellationChannelResultImplDoNotCall5_sEAP8(java.lang.Throwable cause, java.lang.Object element, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        java.lang.Object m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(element);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m12323getOrNullimpl);
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, m12323getOrNullimpl, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit> bindCancellationFun(final kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, final E e) {
        return new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit bindCancellationFun$lambda$89;
                bindCancellationFun$lambda$89 = kotlinx.coroutines.channels.BufferedChannel.bindCancellationFun$lambda$89(kotlin.jvm.functions.Function1.this, e, (java.lang.Throwable) obj, obj2, (kotlin.coroutines.CoroutineContext) obj3);
                return bindCancellationFun$lambda$89;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit bindCancellationFun$lambda$89(kotlin.jvm.functions.Function1 function1, java.lang.Object obj, java.lang.Throwable th, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, obj, coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.KFunction<kotlin.Unit> bindCancellationFun(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        return new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(java.lang.Throwable cause, E element, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object onClosedSend(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e, null, 2, null)) != null) {
            kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException = callUndeliveredElementCatchingException$default;
            kotlin.ExceptionsKt.addSuppressed(undeliveredElementException, getSendException());
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                undeliveredElementException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(undeliveredElementException, cancellableContinuationImpl3);
            }
            cancellableContinuationImpl3.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(undeliveredElementException)));
        } else {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl2;
            java.lang.Throwable sendException = getSendException();
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(sendException, cancellableContinuationImpl4);
            }
            cancellableContinuationImpl4.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(sendException)));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, E e, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl;
        java.lang.Object m10798constructorimpl;
        java.lang.Object result;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            int updateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } else {
                if (updateCellSend != 1) {
                    if (updateCellSend != 2) {
                        if (updateCellSend == 4) {
                            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            cancellableContinuationImpl2 = orCreateCancellableContinuation;
                        } else {
                            if (updateCellSend != 5) {
                                throw new java.lang.IllegalStateException("unexpected".toString());
                            }
                            channelSegment.cleanPrev();
                            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                                long j2 = andIncrement & 1152921504606846975L;
                                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                                long j3 = j2 / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                int i2 = (int) (j2 % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                if (channelSegment3.id != j3) {
                                    kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j3, channelSegment3);
                                    if (findSegmentSend != null) {
                                        channelSegment2 = findSegmentSend;
                                    } else if (isClosedForSend0) {
                                        cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                        break;
                                    }
                                } else {
                                    channelSegment2 = channelSegment3;
                                }
                                kotlinx.coroutines.channels.ChannelSegment channelSegment4 = channelSegment2;
                                int updateCellSend2 = updateCellSend(channelSegment2, i2, e, j2, orCreateCancellableContinuation, isClosedForSend0);
                                if (updateCellSend2 == 0) {
                                    channelSegment4.cleanPrev();
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 == 1) {
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 != 2) {
                                    if (updateCellSend2 == 3) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    if (updateCellSend2 != 4) {
                                        if (updateCellSend2 == 5) {
                                            channelSegment4.cleanPrev();
                                        }
                                        channelSegment3 = channelSegment4;
                                    } else {
                                        if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                            channelSegment4.cleanPrev();
                                        }
                                        cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                    }
                                } else if (isClosedForSend0) {
                                    channelSegment4.onSlotCleaned();
                                    cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                } else {
                                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                                    if (cancellableContinuationImpl3 != null) {
                                        prepareSenderForSuspension(cancellableContinuationImpl3, channelSegment4, i2);
                                    }
                                }
                            }
                        }
                        onClosedSendOnNoWaiterSuspend(e, cancellableContinuationImpl2);
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return result != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
                }
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            }
            cancellableContinuationImpl.resumeWith(m10798constructorimpl);
            result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r11.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (bufferedChannel.onUndeliveredElement != null) {
            throw new java.lang.IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
        }
        kotlinx.coroutines.channels.BufferedChannel.SendBroadcast sendBroadcast = new kotlinx.coroutines.channels.BufferedChannel.SendBroadcast(cancellableContinuationImpl2);
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = channelSegment;
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, sendBroadcast, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment3.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                } else if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment3.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment3.onSlotCleaned();
            } else {
                kotlinx.coroutines.channels.BufferedChannel.SendBroadcast sendBroadcast2 = sendBroadcast instanceof kotlinx.coroutines.Waiter ? sendBroadcast : null;
                if (sendBroadcast2 != null) {
                    bufferedChannel.prepareSenderForSuspension(sendBroadcast2, channelSegment3, i);
                }
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlin.jvm.functions.Function3 function3;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive == symbol2) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                        int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                        if (channelSegment2.id != j2) {
                            kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                            if (findSegmentReceive != null) {
                                channelSegment2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(channelSegment2, i2, andIncrement, orCreateCancellableContinuation);
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                        if (updateCellReceive != symbol3) {
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            if (updateCellReceive != symbol4) {
                                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive == symbol5) {
                                    throw new java.lang.IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                                function3 = (kotlin.jvm.functions.Function3) (function1 != null ? bindCancellationFun(function1) : null);
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else {
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i2);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
                    function3 = (kotlin.jvm.functions.Function3) (function12 != null ? bindCancellationFun(function12) : null);
                }
                orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) updateCellReceive, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) function3);
            } else {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            }
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
    
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, select, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                kotlinx.coroutines.Waiter waiter = select instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) select : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnSend(element, select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, select);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                    channelSegment.cleanPrev();
                    select.selectInRegistrationPhase(updateCellReceive);
                    return;
                }
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                kotlinx.coroutines.Waiter waiter = select instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) select : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnReceive(select);
    }
}
