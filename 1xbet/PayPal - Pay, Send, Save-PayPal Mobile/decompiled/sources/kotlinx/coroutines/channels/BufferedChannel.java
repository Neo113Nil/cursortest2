package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004ì\u0001í\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\"J4\u0010$\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010(J\"\u0010)\u001a\u00020\u0007*\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J#\u0010+\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0002¢\u0006\u0002\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00192\u0006\u0010!\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b4\u0010\"Jê\u0001\u00105\u001a\u0002H6\"\u0004\b\u0001\u001062\u0006\u0010!\u001a\u00028\u00002\b\u00107\u001a\u0004\u0018\u0001082\f\u00109\u001a\b\u0012\u0004\u0012\u0002H60:2<\u0010;\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0004\u0012\u0002H60<2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H60:2h\b\u0002\u0010B\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H60CH\u0082\b¢\u0006\u0002\u0010DJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010!\u001a\u00028\u0000H\u0004¢\u0006\u0004\bF\u00102JX\u0010G\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\u0006\u00107\u001a\u00020*2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070:2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070:H\u0082\b¢\u0006\u0002\u0010HJE\u0010I\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010KJE\u0010L\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010KJ\u0010\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0010H\u0003J\u0010\u0010O\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0010H\u0002J\r\u0010M\u001a\u00020\u0019H\u0010¢\u0006\u0002\bQJ\u0019\u0010R\u001a\u00020\u0019*\u0002082\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010SJ\b\u0010T\u001a\u00020\u0007H\u0014J\b\u0010U\u001a\u00020\u0007H\u0014J\u000e\u0010V\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010WJ,\u0010X\u001a\u00028\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010ZJ\"\u0010[\u001a\u00020\u0007*\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0016\u0010\\\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0004\b^\u0010WJ4\u0010_\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b`\u0010ZJ\u001c\u0010a\u001a\u00020\u00072\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000-H\u0002J\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0010H\u0004J÷\u0001\u0010g\u001a\u0002H6\"\u0004\b\u0001\u001062\b\u00107\u001a\u0004\u0018\u0001082!\u0010h\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H60\u00062Q\u0010;\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(Y\u0012\u0004\u0012\u0002H60i2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002H60:2S\b\u0002\u0010B\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(Y\u0012\u0004\u0012\u0002H60iH\u0082\b¢\u0006\u0002\u0010jJ`\u0010k\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\u0006\u00107\u001a\u00020*2!\u0010h\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070:H\u0082\bJ2\u0010l\u001a\u0004\u0018\u0001082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0002J2\u0010m\u001a\u0004\u0018\u0001082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0002J\"\u0010n\u001a\u00020\u0019*\u0002082\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u0004H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J&\u0010p\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0010H\u0002J&\u0010r\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u0010H\u0002J\u0012\u0010s\u001a\u00020\u00072\b\b\u0002\u0010t\u001a\u00020\u0010H\u0002J\u0015\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u00020\u0010H\u0000¢\u0006\u0002\bwJ\u001f\u0010~\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\b\u0010!\u001a\u0004\u0018\u000108H\u0014J$\u0010\u0081\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00028\u00002\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u0001H\u0002¢\u0006\u0003\u0010\u0082\u0001J!\u0010\u0083\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0091\u0001\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u000108H\u0002J\u0016\u0010\u0092\u0001\u001a\u00020\u00072\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u0001H\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0094\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J!\u0010\u0095\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0084\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0085\u0001\u001a\u0004\u0018\u000108H\u0002J\u0011\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009e\u0001H\u0096\u0002J\t\u0010¨\u0001\u001a\u00020\u0007H\u0014J\u0015\u0010©\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\u0013\u0010«\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001J\u0007\u0010«\u0001\u001a\u00020\u0007J \u0010«\u0001\u001a\u00020\u00072\u0011\u0010ª\u0001\u001a\f\u0018\u00010¬\u0001j\u0005\u0018\u0001`\u00ad\u0001¢\u0006\u0003\u0010®\u0001J\u001b\u0010¯\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0010¢\u0006\u0003\b°\u0001J\u001e\u0010±\u0001\u001a\u00020\u00192\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010«\u0001\u001a\u00020\u0019H\u0014J\t\u0010²\u0001\u001a\u00020\u0007H\u0002J1\u0010³\u0001\u001a\u00020\u00072&\u0010´\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\u0099\u0001¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(ª\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\t\u0010µ\u0001\u001a\u00020\u0007H\u0002J\t\u0010¶\u0001\u001a\u00020\u0007H\u0002J\t\u0010·\u0001\u001a\u00020\u0007H\u0002J\t\u0010¸\u0001\u001a\u00020\u0007H\u0002J\u0018\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0007\u0010»\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010¼\u0001\u001a\u00020\u00072\u0007\u0010»\u0001\u001a\u00020\u0010H\u0002J\u000f\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0018\u0010¾\u0001\u001a\u00020\u00102\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0018\u0010À\u0001\u001a\u00020\u00072\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J \u0010Á\u0001\u001a\u00020\u00072\r\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\r\u0010Â\u0001\u001a\u00020\u0007*\u00020*H\u0002J\r\u0010Ã\u0001\u001a\u00020\u0007*\u00020*H\u0002J\u0016\u0010Ä\u0001\u001a\u00020\u0007*\u00020*2\u0007\u0010Å\u0001\u001a\u00020\u0019H\u0002J\u001b\u0010Í\u0001\u001a\u00020\u00192\u0007\u0010Î\u0001\u001a\u00020\u00102\u0007\u0010Ê\u0001\u001a\u00020\u0019H\u0002J\u000f\u0010Ñ\u0001\u001a\u00020\u0019H\u0000¢\u0006\u0003\bÒ\u0001J'\u0010Ó\u0001\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010v\u001a\u00020\u0010H\u0002J)\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J)\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J2\u0010Ø\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0007\u0010Ù\u0001\u001a\u00020\u0010H\u0002J!\u0010Ú\u0001\u001a\u00020\u00072\u0007\u0010Õ\u0001\u001a\u00020\u00102\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u0012\u0010Û\u0001\u001a\u00020\u00072\u0007\u0010Ü\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ý\u0001\u001a\u00020\u00072\u0007\u0010Ü\u0001\u001a\u00020\u0010H\u0002J\n\u0010Þ\u0001\u001a\u00030ß\u0001H\u0016J\u0010\u0010à\u0001\u001a\u00030ß\u0001H\u0000¢\u0006\u0003\bá\u0001J\u0007\u0010â\u0001\u001a\u00020\u0007JD\u0010ã\u0001\u001a#\u0012\u0005\u0012\u00030\u0099\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070ä\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0002J4\u0010å\u0001\u001a\u00020\u00072\b\u0010ª\u0001\u001a\u00030\u0099\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u0000002\b\u0010æ\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\bç\u0001\u0010è\u0001JM\u0010é\u0001\u001a\u001e\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070i*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\b2\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010ê\u0001J>\u0010é\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070ä\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0002J+\u0010ë\u0001\u001a\u00020\u00072\b\u0010ª\u0001\u001a\u00030\u0099\u00012\u0006\u0010!\u001a\u00028\u00002\b\u0010æ\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0003\u0010è\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\t\u0010\u000e\u001a\u00020\fX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\t\u0010\u0017\u001a\u00020\fX\u0082\u0004R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R\u0015\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cX\u0082\u0004R,\u0010x\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000y8VX\u0096\u0004¢\u0006\f\u0012\u0004\bz\u0010{\u001a\u0004\b|\u0010}R%\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0088\u0001\u0010{\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R+\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008c\u0001\u0010{\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R'\u0010\u008e\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0087\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010{\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R\u008b\u0001\u0010\u0096\u0001\u001aw\u0012\u0018\u0012\u0016\u0012\u0002\b\u00030\u0080\u0001¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u007f\u0012\u0016\u0012\u0014\u0018\u000108¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(\u0097\u0001\u0012\u0016\u0012\u0014\u0018\u000108¢\u0006\r\b=\u0012\t\b>\u0012\u0005\b\b(\u0098\u0001\u0012 \u0012\u001e\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u00070i\u0018\u00010ij\u0005\u0018\u0001`\u009b\u0001X\u0082\u0004¢\u0006\t\n\u0000\u0012\u0005\b\u009c\u0001\u0010{R\u0012\u0010\u009f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u001cX\u0082\u0004R\u001a\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010£\u0001\u001a\u00030\u0099\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00030\u0099\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¢\u0001R\u0012\u0010§\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u001cX\u0082\u0004R\u0016\u0010¹\u0001\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\u001aR\u001d\u0010Æ\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÇ\u0001\u0010{\u001a\u0005\bÆ\u0001\u0010\u001aR\u001b\u0010È\u0001\u001a\u00020\u0019*\u00020\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001d\u0010Ê\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bË\u0001\u0010{\u001a\u0005\bÊ\u0001\u0010\u001aR\u001b\u0010Ì\u0001\u001a\u00020\u0019*\u00020\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010É\u0001R\u001d\u0010Ï\u0001\u001a\u00020\u00198VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÐ\u0001\u0010{\u001a\u0005\bÏ\u0001\u0010\u001a¨\u0006î\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "sendersAndCloseStatus", "Lkotlinx/atomicfu/AtomicLong;", "receivers", "bufferEnd", "sendersCounter", "", "getSendersCounter$kotlinx_coroutines_core", "()J", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "bufferEndCounter", "getBufferEndCounter", "completedExpandBuffersAndPauseFlag", "isRendezvousOrUnlimited", "", "()Z", "sendSegment", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "receiveSegment", "bufferEndSegment", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSend", "sendOnNoWaiterSuspend", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "index", lib.android.paypal.com.magnessdk.g.n2, "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareSenderForSuspension", "Lkotlinx/coroutines/Waiter;", "onClosedSendOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "waiter", "", "onRendezvousOrBuffered", "Lkotlin/Function0;", "onSuspend", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "segm", "i", "onClosed", "onNoWaiterSuspend", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "updateCellSend", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "shouldSendSuspend", "curSendersAndCloseStatus", "bufferOrRendezvousSend", "curSenders", "shouldSendSuspend$kotlinx_coroutines_core", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOnNoWaiterSuspend", "r", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "onClosedReceiveCatchingOnNoWaiterSuspend", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "receiveImpl", "onElementRetrieved", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "updateCellReceive", "updateCellReceiveSlow", "tryResumeSender", "expandBuffer", "updateCellExpandBuffer", util.h.xy.cb.b.f1091, "updateCellExpandBufferSlow", "incCompletedExpandBufferAttempts", "nAttempts", "waitExpandBufferCompletion", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "()V", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectSend", "ignoredParam", "selectResult", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "registerSelectForReceive", "onClosedSelectOnReceive", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "onUndeliveredElementReceiveCancellationConstructor", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "_closeCause", "closeCause", "getCloseCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "receiveException", "getReceiveException", "closeHandler", "onClosedIdempotent", "close", "cause", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "closeOrCancelImpl", "invokeCloseHandler", "invokeOnClose", "handler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "isConflatedDropOldest", "completeClose", "sendersCur", "completeCancel", "closeLinkedList", "markAllEmptyCellsAsClosed", "lastSegment", "removeUnprocessedElements", "cancelSuspendedReceiveRequests", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "isClosedForSend", "isClosedForSend$annotations", "isClosedForSend0", "(J)Z", "isClosedForReceive", "isClosedForReceive$annotations", "isClosedForReceive0", "isClosed", "sendersAndCloseStatusCur", "isEmpty", "isEmpty$annotations", "hasElements", "hasElements$kotlinx_coroutines_core", "isCellNonEmpty", "findSegmentSend", "id", "startFrom", "findSegmentReceive", "findSegmentBufferEnd", "currentBufferEndCounter", "moveSegmentBufferEndToSpecifiedOrLast", "updateSendersCounterIfLower", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "updateReceiversCounterIfLower", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "checkSegmentStructureInvariants", "bindCancellationFunResult", "Lkotlin/reflect/KFunction3;", "onCancellationChannelResultImplDoNotCall", "context", "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "bindCancellationFun", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "onCancellationImplDoNotCall", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.Channel<E> {
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private final int getOutputMinFrameDuration;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> getOutputStallDuration;
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getOutputFormats = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getInputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getInputFormats = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "sendSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "_closeCause$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "closeHandler$volatile");

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        kotlinx.coroutines.internal.Symbol symbol;
        this.getOutputMinFrameDuration = i;
        this.onUndeliveredElement = function1;
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid channel capacity: ");
            sb.append(i);
            sb.append(", should be >=0");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.bufferEnd$volatile = kotlinx.coroutines.channels.BufferedChannelKt.access$initialBufferEnd(i);
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRanges;
        this.completedExpandBuffersAndPauseFlag$volatile = atomicLongFieldUpdater.get(this);
        kotlinx.coroutines.channels.ChannelSegment channelSegment = new kotlinx.coroutines.channels.ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        long j = atomicLongFieldUpdater.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDurationlomOqCM;
            kotlin.jvm.internal.Intrinsics.checkNotNull(channelSegment, "");
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.getOutputStallDuration = function1 != 0 ? new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return kotlinx.coroutines.channels.BufferedChannel.m24069$r8$lambda$RGQVgAvWnoZmUCAtr48LHy5NVI(kotlinx.coroutines.channels.BufferedChannel.this, (kotlinx.coroutines.selects.SelectInstance) obj, obj2, obj3);
            }
        } : null;
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.getInputFormats;
        this._closeCause$volatile = symbol;
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/coroutines/CancellableContinuation;", "", "p0", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/internal/Segment;", "", "p1", "", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CancellableContinuation;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class SendBroadcast implements kotlinx.coroutines.Waiter {
        private final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuation, "");
            this.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.CancellableContinuationImpl) cancellableContinuation;
            this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> p0, int p1) {
            this.getHighResolutionOutputSizeshNQ4ISI.invokeOnCancellation(p0, p1);
        }
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final java.lang.Object m24074trySendDropOldestJP2dKIU(E element) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
        while (true) {
            long andIncrement = getOutputFormats.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend = access$findSegmentSend(this, j2, channelSegment2);
                if (access$findSegmentSend != null) {
                    channelSegment = access$findSegmentSend;
                } else if (access$isClosedForSend0) {
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i, element, j, symbol, access$isClosedForSend0);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
            }
            if (access$updateCellSend == 1) {
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
            }
            if (access$updateCellSend == 2) {
                if (!access$isClosedForSend0) {
                    dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i);
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
                }
                channelSegment.onSlotCleaned();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
            }
            if (access$updateCellSend == 3) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (access$updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
            }
            if (access$updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    private final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, E e) {
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            return ((kotlinx.coroutines.selects.SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof kotlinx.coroutines.channels.ReceiveCatching) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(((kotlinx.coroutines.channels.ReceiveCatching) obj).getHighResolutionOutputSizeshNQ4ISI, kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(e)), (kotlin.jvm.functions.Function3) (this.onUndeliveredElement != null ? new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1(this) : null));
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) obj).getHighSpeedVideoFpsRangesFor(e);
        }
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0((kotlinx.coroutines.CancellableContinuation) obj, e, (kotlin.jvm.functions.Function3) (this.onUndeliveredElement != null ? new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2(this) : null));
        }
        throw new java.lang.IllegalStateException("Unexpected receiver type: ".concat(java.lang.String.valueOf(obj)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) continuation;
            if ((bufferedChannel$receiveCatching$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.Camera2StreamConfigurationMap -= 2147483648;
                kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                java.lang.Object obj = bufferedChannel$receiveCatching$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bufferedChannel$receiveCatching$12.Camera2StreamConfigurationMap;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(bufferedChannel);
                    long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                    int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment.id != j) {
                        kotlinx.coroutines.channels.ChannelSegment<E> Camera2StreamConfigurationMap2 = bufferedChannel.Camera2StreamConfigurationMap(j, channelSegment);
                        if (Camera2StreamConfigurationMap2 != null) {
                            channelSegment = Camera2StreamConfigurationMap2;
                        } else {
                            continue;
                        }
                    }
                    java.lang.Object highSpeedVideoFpsRangesFor = bufferedChannel.getHighSpeedVideoFpsRangesFor(channelSegment, i2, andIncrement, (java.lang.Object) null);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                    if (highSpeedVideoFpsRangesFor != symbol) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                        if (highSpeedVideoFpsRangesFor != symbol2) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                            if (highSpeedVideoFpsRangesFor == symbol3) {
                                bufferedChannel$receiveCatching$12.Camera2StreamConfigurationMap = 1;
                                java.lang.Object highSpeedVideoFpsRangesFor2 = bufferedChannel.getHighSpeedVideoFpsRangesFor((kotlinx.coroutines.channels.ChannelSegment) channelSegment, i2, andIncrement, (kotlin.coroutines.Continuation) bufferedChannel$receiveCatching$12);
                                return highSpeedVideoFpsRangesFor2 == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRangesFor2;
                            }
                            channelSegment.cleanPrev();
                            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(highSpeedVideoFpsRangesFor);
                        }
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                    } else {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                }
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        java.lang.Object obj2 = bufferedChannel$receiveCatching$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bufferedChannel$receiveCatching$122.Camera2StreamConfigurationMap;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.channels.ChannelResult m24079boximpl;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            if ((bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoFpsRanges = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoSizes = channelSegment;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoFpsRangesFor = j;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Camera2StreamConfigurationMap = 1;
                    kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
                    kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12));
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(orCreateCancellableContinuation, "");
                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching = new kotlinx.coroutines.channels.ReceiveCatching(orCreateCancellableContinuation);
                        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(channelSegment, i, j, receiveCatching);
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                        if (highSpeedVideoFpsRangesFor != symbol) {
                            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            kotlin.reflect.KFunction kFunction = null;
                            if (highSpeedVideoFpsRangesFor == symbol2) {
                                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        access$onClosedReceiveCatchingOnNoWaiterSuspend(this, orCreateCancellableContinuation);
                                        break;
                                    }
                                    long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(this);
                                    long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                    int i3 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                    if (channelSegment2.id != j2) {
                                        kotlinx.coroutines.channels.ChannelSegment Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j2, channelSegment2);
                                        if (Camera2StreamConfigurationMap2 != null) {
                                            channelSegment2 = Camera2StreamConfigurationMap2;
                                        } else {
                                            continue;
                                        }
                                    }
                                    java.lang.Object highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(channelSegment2, i3, andIncrement, receiveCatching);
                                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                                    if (highSpeedVideoFpsRangesFor2 != symbol3) {
                                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                                        if (highSpeedVideoFpsRangesFor2 != symbol4) {
                                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                                            if (highSpeedVideoFpsRangesFor2 == symbol5) {
                                                throw new java.lang.IllegalStateException("unexpected".toString());
                                            }
                                            channelSegment2.cleanPrev();
                                            m24079boximpl = kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(highSpeedVideoFpsRangesFor2));
                                            function1 = this.onUndeliveredElement;
                                        } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    } else {
                                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching2 = receiveCatching;
                                        access$prepareReceiverForSuspension(this, receiveCatching, channelSegment2, i3);
                                        break;
                                    }
                                }
                                orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) m24079boximpl, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) kFunction);
                            } else {
                                channelSegment.cleanPrev();
                                m24079boximpl = kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(highSpeedVideoFpsRangesFor));
                                function1 = this.onUndeliveredElement;
                                if (function1 != null) {
                                    kFunction = access$bindCancellationFunResult(this, function1);
                                }
                                orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) m24079boximpl, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) kFunction);
                            }
                        } else {
                            access$prepareReceiverForSuspension(this, receiveCatching, channelSegment, i);
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
                    long j3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        java.lang.Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        return ((kotlinx.coroutines.channels.ChannelResult) obj2).getGetHighSpeedVideoFpsRanges();
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isConflatedDropOldest()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getInputSizeshNQ4ISI;
            long j = atomicLongFieldUpdater.get(this);
            if (globalCellIndex < java.lang.Math.max(this.getOutputMinFrameDuration + j, getHighSpeedVideoFpsRanges.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j, j + 1)) {
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment<E> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j2, channelSegment);
                    if (Camera2StreamConfigurationMap2 == null) {
                        continue;
                    } else {
                        channelSegment = Camera2StreamConfigurationMap2;
                    }
                }
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(channelSegment, i, j, (java.lang.Object) null);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                if (highSpeedVideoFpsRangesFor != symbol) {
                    channelSegment.cleanPrev();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, highSpeedVideoFpsRangesFor, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                } else if (j < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, java.lang.Object obj) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.lang.Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (getOutputFormats.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                    return symbol3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    getHighSpeedVideoFpsRanges();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                getHighSpeedVideoFpsRanges();
                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
            }
        }
        return getHighSpeedVideoFpsRanges(channelSegment, i, j, obj);
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, java.lang.Object obj) {
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
            java.lang.Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol6)) {
                            getHighSpeedVideoFpsRanges();
                            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                        }
                    } else {
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            return symbol8;
                        }
                        symbol9 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            return symbol10;
                        }
                        if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            symbol12 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                            if (state$kotlinx_coroutines_core != symbol12) {
                                symbol13 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizes;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol13)) {
                                    boolean z = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB;
                                    if (z) {
                                        state$kotlinx_coroutines_core = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).Camera2StreamConfigurationMap;
                                    }
                                    if (getHighSpeedVideoFpsRangesFor(state$kotlinx_coroutines_core, channelSegment, i)) {
                                        symbol16 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                                        channelSegment.setState$kotlinx_coroutines_core(i, symbol16);
                                        getHighSpeedVideoFpsRanges();
                                        return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                                    }
                                    symbol14 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                                    channelSegment.setState$kotlinx_coroutines_core(i, symbol14);
                                    channelSegment.onCancelledRequest(i, false);
                                    if (z) {
                                        getHighSpeedVideoFpsRanges();
                                    }
                                    symbol15 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                                    return symbol15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            getHighSpeedVideoFpsRanges();
                            symbol11 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            return symbol11;
                        }
                    }
                }
            }
            if (j < (getOutputFormats.get(this) & 1152921504606846975L)) {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                    getHighSpeedVideoFpsRanges();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                    return symbol2;
                }
            } else {
                if (obj == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                    return symbol3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    getHighSpeedVideoFpsRanges();
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                    return symbol4;
                }
            }
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor((kotlinx.coroutines.CancellableContinuation) obj, kotlin.Unit.INSTANCE);
        }
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed = ((kotlinx.coroutines.selects.SelectImplementation) obj).trySelectDetailed(this, kotlin.Unit.INSTANCE);
            if (trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
            return kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor(((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) obj).getHighResolutionOutputSizeshNQ4ISI, java.lang.Boolean.TRUE);
        }
        throw new java.lang.IllegalStateException("Unexpected waiter: ".concat(java.lang.String.valueOf(obj)).toString());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.BufferedChannel<E>> getOnSend() {
        kotlinx.coroutines.channels.BufferedChannel$onSend$1 bufferedChannel$onSend$1 = kotlinx.coroutines.channels.BufferedChannel$onSend$1.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$1, "");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onSend$2 bufferedChannel$onSend$2 = kotlinx.coroutines.channels.BufferedChannel$onSend$2.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$2, "");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
        kotlinx.coroutines.channels.BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = kotlinx.coroutines.channels.BufferedChannel$onReceive$1.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = kotlinx.coroutines.channels.BufferedChannel$onReceive$2.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.getOutputStallDuration);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.getOutputStallDuration);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.getOutputStallDuration);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
        return new kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator();
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelSegment;", "p0", "", "p1", "", "p2", "getHighSpeedVideoSizes", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Segment;", "", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;)Z", "Camera2StreamConfigurationMap", "()V", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/CancellableContinuationImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class BufferedChannelIterator implements kotlinx.coroutines.channels.ChannelIterator<E>, kotlinx.coroutines.Waiter {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> Camera2StreamConfigurationMap;

        public BufferedChannelIterator() {
            kotlinx.coroutines.internal.Symbol symbol;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoSizesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = symbol;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public final /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation continuation) {
            return kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.internal.Symbol symbol4;
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoSizesFor;
            boolean z = true;
            if (obj == symbol || this.getHighResolutionOutputSizeshNQ4ISI == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.getHighSpeedVideoSizesFor.get(bufferedChannel);
                while (true) {
                    if (!bufferedChannel.isClosedForReceive()) {
                        long andIncrement = kotlinx.coroutines.channels.BufferedChannel.getInputSizeshNQ4ISI.getAndIncrement(bufferedChannel);
                        long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                        int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                        if (channelSegment.id != j) {
                            kotlinx.coroutines.channels.ChannelSegment<E> Camera2StreamConfigurationMap = bufferedChannel.Camera2StreamConfigurationMap(j, channelSegment);
                            if (Camera2StreamConfigurationMap == null) {
                                continue;
                            } else {
                                channelSegment = Camera2StreamConfigurationMap;
                            }
                        }
                        java.lang.Object highSpeedVideoFpsRangesFor = bufferedChannel.getHighSpeedVideoFpsRangesFor(channelSegment, i, andIncrement, (java.lang.Object) null);
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                        if (highSpeedVideoFpsRangesFor != symbol2) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            if (highSpeedVideoFpsRangesFor != symbol3) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                                if (highSpeedVideoFpsRangesFor == symbol4) {
                                    return getHighSpeedVideoSizes(channelSegment, i, andIncrement, continuation);
                                }
                                channelSegment.cleanPrev();
                                this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
                            } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                        } else {
                            throw new java.lang.IllegalStateException("unreachable".toString());
                        }
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
                        java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
                        if (closeCause != null) {
                            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closeCause);
                        }
                        z = false;
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
        
            r9 = kotlinx.coroutines.channels.BufferedChannel.access$bindCancellationFun(r6, r12, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
        
            r7.resume((kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean>) r11, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean>, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
        
            if (r12 != null) goto L47;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            java.lang.Boolean boxBoolean;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.internal.Symbol symbol4;
            kotlinx.coroutines.internal.Symbol symbol5;
            kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            try {
                this.Camera2StreamConfigurationMap = orCreateCancellableContinuation;
                java.lang.Object highSpeedVideoFpsRangesFor = bufferedChannel.getHighSpeedVideoFpsRangesFor(channelSegment, i, j, this);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                if (highSpeedVideoFpsRangesFor != symbol) {
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function3 function3 = null;
                    function3 = null;
                    if (highSpeedVideoFpsRangesFor == symbol2) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.getHighSpeedVideoSizesFor.get(bufferedChannel);
                        while (true) {
                            if (!bufferedChannel.isClosedForReceive()) {
                                long andIncrement = kotlinx.coroutines.channels.BufferedChannel.getInputSizeshNQ4ISI.getAndIncrement(bufferedChannel);
                                long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                if (channelSegment2.id != j2) {
                                    kotlinx.coroutines.channels.ChannelSegment Camera2StreamConfigurationMap = bufferedChannel.Camera2StreamConfigurationMap(j2, channelSegment2);
                                    if (Camera2StreamConfigurationMap != null) {
                                        channelSegment2 = Camera2StreamConfigurationMap;
                                    }
                                }
                                highSpeedVideoFpsRangesFor = bufferedChannel.getHighSpeedVideoFpsRangesFor(channelSegment2, i2, andIncrement, this);
                                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                                if (highSpeedVideoFpsRangesFor != symbol3) {
                                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                                    if (highSpeedVideoFpsRangesFor != symbol4) {
                                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                                        if (highSpeedVideoFpsRangesFor == symbol5) {
                                            throw new java.lang.IllegalStateException("unexpected".toString());
                                        }
                                        channelSegment2.cleanPrev();
                                        this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
                                        this.Camera2StreamConfigurationMap = null;
                                        boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        function1 = bufferedChannel.onUndeliveredElement;
                                        if (function1 != null) {
                                        }
                                    } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                        channelSegment2.cleanPrev();
                                    }
                                } else {
                                    kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator bufferedChannelIterator = this;
                                    kotlinx.coroutines.channels.BufferedChannel.access$prepareReceiverForSuspension(bufferedChannel, this, channelSegment2, i2);
                                    break;
                                }
                            } else {
                                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.Camera2StreamConfigurationMap;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
                                this.Camera2StreamConfigurationMap = null;
                                this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
                                java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
                                if (closeCause == null) {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                                } else {
                                    kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
                                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                                        closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
                                    }
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(closeCause)));
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
                        this.Camera2StreamConfigurationMap = null;
                        boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        function1 = bufferedChannel.onUndeliveredElement;
                    }
                } else {
                    kotlinx.coroutines.channels.BufferedChannel.access$prepareReceiverForSuspension(bufferedChannel, this, channelSegment, i);
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
        public final void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> p0, int p1) {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.Camera2StreamConfigurationMap;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(p0, p1);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final E next() {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            E e = (E) this.getHighResolutionOutputSizeshNQ4ISI;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoSizesFor;
            if (e != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoSizesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = symbol2;
                if (e != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return e;
                }
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(kotlinx.coroutines.channels.BufferedChannel.access$getReceiveException(kotlinx.coroutines.channels.BufferedChannel.this));
            }
            throw new java.lang.IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean getHighSpeedVideoFpsRangesFor(E p0) {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = p0;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = kotlinx.coroutines.channels.BufferedChannel.this.onUndeliveredElement;
            return kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(cancellableContinuationImpl2, java.lang.Boolean.TRUE, function1 != null ? kotlinx.coroutines.channels.BufferedChannel.access$bindCancellationFun(kotlinx.coroutines.channels.BufferedChannel.this, function1, p0) : null);
        }

        public final void Camera2StreamConfigurationMap() {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                return;
            }
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(closeCause)));
        }
    }

    protected final java.lang.Throwable getSendException() {
        java.lang.Throwable closeCause = getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedSendChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
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

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.Waiter waiter, boolean z) {
        kotlinx.coroutines.channels.ClosedReceiveChannelException sendException;
        if (!(waiter instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast)) {
            if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
                kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) waiter;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                if (!z) {
                    sendException = getSendException();
                } else {
                    sendException = getCloseCause();
                    if (sendException == null) {
                        sendException = new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
                    }
                }
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(sendException)));
                return;
            }
            if (waiter instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl = ((kotlinx.coroutines.channels.ReceiveCatching) waiter).getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getCloseCause()))));
                return;
            } else if (waiter instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
                ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) waiter).Camera2StreamConfigurationMap();
                return;
            } else {
                if (!(waiter instanceof kotlinx.coroutines.selects.SelectInstance)) {
                    throw new java.lang.IllegalStateException("Unexpected waiter: ".concat(java.lang.String.valueOf(waiter)).toString());
                }
                ((kotlinx.coroutines.selects.SelectInstance) waiter).trySelect(this, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
        }
        kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = ((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) waiter).getHighResolutionOutputSizeshNQ4ISI;
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRangesFor(long j, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment.getNext()) == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighResolutionOutputSizeshNQ4ISI;
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    kotlinx.coroutines.channels.ChannelSegment<E> channelSegment4 = channelSegment;
                    if (segment.id >= channelSegment4.id) {
                        return;
                    }
                    if (channelSegment4.tryIncPointers$kotlinx_coroutines_core()) {
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, channelSegment4)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                                return;
                            }
                            return;
                        } else if (channelSegment4.decPointers$kotlinx_coroutines_core()) {
                            channelSegment4.remove();
                        }
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c9, code lost:
    
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d0, code lost:
    
        if (r3 != null) goto L90;
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
        int i = (int) (getOutputFormats.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("capacity=");
        sb2.append(this.getOutputMinFrameDuration);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(sb2.toString());
        sb.append("data=[");
        int i2 = 0;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{getHighSpeedVideoSizesFor.get(this), getInputFormats.get(this), getHighResolutionOutputSizeshNQ4ISI.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDurationlomOqCM;
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
        loop2: while (true) {
            int i3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j3 = (channelSegment3.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i4;
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                java.lang.Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i4);
                java.lang.Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i4);
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancellableContinuation) {
                    str = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.SelectInstance) {
                    str = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
                    str = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("EB(");
                    sb3.append(state$kotlinx_coroutines_core);
                    sb3.append(')');
                    str = sb3.toString();
                } else {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizes;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2)) {
                            if (state$kotlinx_coroutines_core != null) {
                                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol5)) {
                                            symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol6)) {
                                                symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol7) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                                    str = state$kotlinx_coroutines_core.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                    str = "resuming_sender";
                }
                if (element$kotlinx_coroutines_core != null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(");
                    sb4.append(str);
                    sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    sb4.append(element$kotlinx_coroutines_core);
                    sb4.append("),");
                    sb.append(sb4.toString());
                } else {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(str);
                    sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    sb.append(sb5.toString());
                }
                i4++;
            }
            i2 = 0;
        }
        if (kotlin.text.StringsKt.last(sb) == ',') {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toStringDebug$kotlinx_coroutines_core() {
        java.lang.String valueOf;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("S=");
        sb2.append(getSendersCounter$kotlinx_coroutines_core());
        sb2.append(",R=");
        sb2.append(getReceiversCounter$kotlinx_coroutines_core());
        sb2.append(",B=");
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRanges;
        sb2.append(atomicLongFieldUpdater.get(this));
        sb2.append(",B'=");
        sb2.append(getHighSpeedVideoFpsRangesFor.get(this));
        sb2.append(",C=");
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = getOutputFormats;
        sb2.append((int) (atomicLongFieldUpdater2.get(this) >> 60));
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(sb2.toString());
        int i = (int) (atomicLongFieldUpdater2.get(this) >> 60);
        if (i == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb.append("CLOSED,");
        } else if (i == 3) {
            sb.append("CANCELLED,");
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SEND_SEGM=");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getInputFormats;
        sb3.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater.get(this)));
        sb3.append(",RCV_SEGM=");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = getHighSpeedVideoSizesFor;
        sb3.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        long j = atomicLongFieldUpdater.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(",EB_SEGM=");
            sb4.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(getHighResolutionOutputSizeshNQ4ISI.get(this)));
            sb.append(sb4.toString());
        }
        sb.append("  ");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), getHighResolutionOutputSizeshNQ4ISI.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDurationlomOqCM;
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
            long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j3 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) next;
        do {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment3));
            sb5.append("=[");
            sb5.append(channelSegment3.isRemoved() ? "*" : "");
            sb5.append(channelSegment3.id);
            sb5.append(",prev=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getPrev();
            sb5.append(channelSegment4 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment4) : null);
            sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb.append(sb5.toString());
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
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EB(");
                    sb6.append(state$kotlinx_coroutines_core);
                    sb6.append(')');
                    valueOf = sb6.toString();
                } else {
                    valueOf = java.lang.String.valueOf(state$kotlinx_coroutines_core);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
                sb7.append(i3);
                sb7.append("]=(");
                sb7.append(valueOf);
                sb7.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                sb7.append(element$kotlinx_coroutines_core);
                sb7.append("),");
                sb.append(sb7.toString());
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("next=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment5 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
            sb8.append(channelSegment5 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment5) : null);
            sb8.append("]  ");
            sb.append(sb8.toString());
            channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
        } while (channelSegment3 != null);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
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
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                undeliveredElementException = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(undeliveredElementException, cancellableContinuationImpl3);
            }
            cancellableContinuationImpl3.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(undeliveredElementException)));
        } else {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl2;
            java.lang.Throwable sendException = getSendException();
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(sendException, cancellableContinuationImpl4);
            }
            cancellableContinuationImpl4.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(sendException)));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, E e, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl;
        java.lang.Object result;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i, e, j, orCreateCancellableContinuation, false);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            } else {
                if (access$updateCellSend != 1) {
                    if (access$updateCellSend != 2) {
                        if (access$updateCellSend != 4) {
                            if (access$updateCellSend != 5) {
                                throw new java.lang.IllegalStateException("unexpected".toString());
                            }
                            channelSegment.cleanPrev();
                            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
                            while (true) {
                                long andIncrement = getOutputFormats.getAndIncrement(this);
                                long j2 = andIncrement & 1152921504606846975L;
                                boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
                                long j3 = j2 / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                int i2 = (int) (j2 % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                if (channelSegment2.id != j3) {
                                    kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend = access$findSegmentSend(this, j3, channelSegment2);
                                    if (access$findSegmentSend != null) {
                                        channelSegment2 = access$findSegmentSend;
                                    } else if (access$isClosedForSend0) {
                                        break;
                                    }
                                }
                                int access$updateCellSend2 = access$updateCellSend(this, channelSegment2, i2, e, j2, orCreateCancellableContinuation, access$isClosedForSend0);
                                if (access$updateCellSend2 == 0) {
                                    channelSegment2.cleanPrev();
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    break;
                                }
                                if (access$updateCellSend2 == 1) {
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                    break;
                                }
                                if (access$updateCellSend2 != 2) {
                                    if (access$updateCellSend2 == 3) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    if (access$updateCellSend2 != 4) {
                                        if (access$updateCellSend2 == 5) {
                                            channelSegment2.cleanPrev();
                                        }
                                    } else if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegment2.cleanPrev();
                                    }
                                } else if (access$isClosedForSend0) {
                                    channelSegment2.onSlotCleaned();
                                } else {
                                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                                    if (cancellableContinuationImpl2 != null) {
                                        access$prepareSenderForSuspension(this, cancellableContinuationImpl2, channelSegment2, i2);
                                    }
                                }
                            }
                        } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        access$onClosedSendOnNoWaiterSuspend(this, e, orCreateCancellableContinuation);
                    } else {
                        access$prepareSenderForSuspension(this, orCreateCancellableContinuation, channelSegment, i);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return result != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
                }
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            }
            cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r10 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlinx.coroutines.channels.ChannelSegment) channelSegment, i, j, (java.lang.Object) orCreateCancellableContinuation);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
            if (highSpeedVideoFpsRangesFor != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                kotlin.reflect.KFunction kFunction = null;
                kFunction = null;
                if (highSpeedVideoFpsRangesFor == symbol2) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            access$onClosedReceiveOnNoWaiterSuspend(this, orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(this);
                        long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                        int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                        if (channelSegment2.id != j2) {
                            kotlinx.coroutines.channels.ChannelSegment Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j2, channelSegment2);
                            if (Camera2StreamConfigurationMap2 != null) {
                                channelSegment2 = Camera2StreamConfigurationMap2;
                            } else {
                                continue;
                            }
                        }
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(channelSegment2, i2, andIncrement, (java.lang.Object) orCreateCancellableContinuation);
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                        if (highSpeedVideoFpsRangesFor != symbol3) {
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                            if (highSpeedVideoFpsRangesFor != symbol4) {
                                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                                if (highSpeedVideoFpsRangesFor == symbol5) {
                                    throw new java.lang.IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                function1 = this.onUndeliveredElement;
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else {
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                access$prepareReceiverForSuspension(this, cancellableContinuationImpl, channelSegment2, i2);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    function1 = this.onUndeliveredElement;
                    if (function1 != null) {
                        kFunction = access$bindCancellationFun(this, function1);
                    }
                    orCreateCancellableContinuation.resume((kotlinx.coroutines.CancellableContinuationImpl) highSpeedVideoFpsRangesFor, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) kFunction);
                }
            } else {
                access$prepareReceiverForSuspension(this, orCreateCancellableContinuation, channelSegment, i);
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

    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
        while (true) {
            long andIncrement = getOutputFormats.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend = access$findSegmentSend(this, j2, channelSegment);
                if (access$findSegmentSend != null) {
                    channelSegment = access$findSegmentSend;
                } else if (access$isClosedForSend0) {
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null) {
                        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, select.getGetHighResolutionOutputSizeshNQ4ISI());
                    }
                    select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                    return;
                }
            }
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i, element, j, select, access$isClosedForSend0);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                return;
            }
            if (access$updateCellSend == 1) {
                select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                return;
            }
            if (access$updateCellSend == 2) {
                if (access$isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
                    if (function12 != null) {
                        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function12, element, select.getGetHighResolutionOutputSizeshNQ4ISI());
                    }
                    select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                    return;
                }
                kotlinx.coroutines.Waiter waiter = select instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) select : null;
                if (waiter != null) {
                    access$prepareSenderForSuspension(this, waiter, channelSegment, i);
                    return;
                }
                return;
            }
            if (access$updateCellSend == 3) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (access$updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                kotlin.jvm.functions.Function1<E, kotlin.Unit> function13 = this.onUndeliveredElement;
                if (function13 != null) {
                    kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function13, element, select.getGetHighResolutionOutputSizeshNQ4ISI());
                }
                select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            if (access$updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4YtRDnxWiAY_lEFg7xfxub3g44Y(java.lang.Object obj, kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Throwable th, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (obj != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RGQ-VgAvWnoZmUCAtr48LHy5NVI, reason: not valid java name */
    public static /* synthetic */ kotlin.jvm.functions.Function3 m24069$r8$lambda$RGQVgAvWnoZmUCAtr48LHy5NVI(final kotlinx.coroutines.channels.BufferedChannel bufferedChannel, final kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj, final java.lang.Object obj2) {
        return new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return kotlinx.coroutines.channels.BufferedChannel.$r8$lambda$4YtRDnxWiAY_lEFg7xfxub3g44Y(obj2, bufferedChannel, selectInstance, (java.lang.Throwable) obj3, obj4, (kotlin.coroutines.CoroutineContext) obj5);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cFjTbckZ8dFxJdDmoJhWmyFFbYA(kotlin.jvm.functions.Function1 function1, java.lang.Object obj, java.lang.Throwable th, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, obj, coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$bindCancellationFun(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, final kotlin.jvm.functions.Function1 function1, final java.lang.Object obj) {
        return new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return kotlinx.coroutines.channels.BufferedChannel.$r8$lambda$cFjTbckZ8dFxJdDmoJhWmyFFbYA(kotlin.jvm.functions.Function1.this, obj, (java.lang.Throwable) obj2, obj3, (kotlin.coroutines.CoroutineContext) obj4);
            }
        };
    }

    public static final /* synthetic */ kotlin.reflect.KFunction access$bindCancellationFun(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlin.jvm.functions.Function1 function1) {
        return new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2(bufferedChannel);
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, long j, kotlinx.coroutines.channels.ChannelSegment channelSegment) {
        java.lang.Object findSegmentInternal;
        long j2;
        long j3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getInputFormats;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                break;
            }
            kotlinx.coroutines.internal.Segment m24124getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            while (true) {
                kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(bufferedChannel);
                if (segment.id >= m24124getSegmentimpl.id) {
                    break loop0;
                }
                if (m24124getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, bufferedChannel, segment, m24124getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m24124getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m24124getSegmentimpl.remove();
                    }
                }
            }
        }
        if (!kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            if (channelSegment2.id > j) {
                long j4 = channelSegment2.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getOutputFormats;
                do {
                    j2 = atomicLongFieldUpdater.get(bufferedChannel);
                    j3 = 1152921504606846975L & j2;
                    if (j3 >= j4) {
                        break;
                    }
                } while (!getOutputFormats.compareAndSet(bufferedChannel, j2, kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(j3, (int) (j2 >> 60))));
                if (channelSegment2.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return null;
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment2.id == j) {
                return channelSegment2;
            }
            throw new java.lang.AssertionError();
        }
        bufferedChannel.isClosedForSend();
        if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    public static final /* synthetic */ kotlin.reflect.KFunction access$bindCancellationFunResult(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlin.jvm.functions.Function1 function1) {
        return new kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1(bufferedChannel);
    }

    public static final /* synthetic */ java.lang.Throwable access$getReceiveException(kotlinx.coroutines.channels.BufferedChannel bufferedChannel) {
        java.lang.Throwable closeCause = bufferedChannel.getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public static final /* synthetic */ boolean access$isClosedForSend0(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, long j) {
        return bufferedChannel.getHighSpeedVideoFpsRangesFor(j, false);
    }

    /* renamed from: access$onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public static final /* synthetic */ void m24070access$onCancellationChannelResultImplDoNotCall5_sEAP8(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = bufferedChannel.onUndeliveredElement;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        java.lang.Object m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m24084getOrNullimpl);
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, m24084getOrNullimpl, coroutineContext);
    }

    public static final /* synthetic */ void access$onClosedReceiveCatchingOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(bufferedChannel.getCloseCause()))));
    }

    public static final /* synthetic */ void access$onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        kotlinx.coroutines.CancellableContinuation cancellableContinuation2 = cancellableContinuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        kotlinx.coroutines.channels.ClosedReceiveChannelException closeCause = bufferedChannel.getCloseCause();
        if (closeCause == null) {
            closeCause = new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(closeCause)));
    }

    public static final /* synthetic */ void access$onCancellationImplDoNotCall(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = bufferedChannel.onUndeliveredElement;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, obj, coroutineContext);
    }

    public static final /* synthetic */ void access$onClosedSendOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = bufferedChannel.onUndeliveredElement;
        if (function1 != null) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, obj, cancellableContinuation.getGetInputFormats());
        }
        kotlinx.coroutines.CancellableContinuation cancellableContinuation2 = cancellableContinuation;
        java.lang.Throwable sendException = bufferedChannel.getSendException();
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(sendException, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation2);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(sendException)));
    }

    public static final /* synthetic */ void access$prepareReceiverForSuspension(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment channelSegment, int i) {
        bufferedChannel.onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    public static final /* synthetic */ void access$prepareSenderForSuspension(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectReceive(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        java.lang.Throwable closeCause = bufferedChannel.getCloseCause();
        if (closeCause == null) {
            throw new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        throw closeCause;
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectReceiveOrNull(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (bufferedChannel.getCloseCause() == null) {
            return null;
        }
        java.lang.Throwable closeCause = bufferedChannel.getCloseCause();
        if (closeCause == null) {
            throw new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        throw closeCause;
    }

    public static final /* synthetic */ java.lang.Object access$processResultSelectSend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return bufferedChannel;
        }
        throw bufferedChannel.getSendException();
    }

    public static final /* synthetic */ int access$updateCellSend(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.channels.ChannelSegment channelSegment, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
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
        channelSegment.storeElement$kotlinx_coroutines_core(i, obj);
        if (!z) {
            java.lang.Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (j < getHighSpeedVideoFpsRanges.get(bufferedChannel) || j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core() + bufferedChannel.getOutputMinFrameDuration) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                        return 1;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
                if (bufferedChannel.getHighSpeedVideoFpsRanges(state$kotlinx_coroutines_core, obj)) {
                    symbol10 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                    channelSegment.setState$kotlinx_coroutines_core(i, symbol10);
                    bufferedChannel.onReceiveDequeued();
                    return 0;
                }
                symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                java.lang.Object andSetState$kotlinx_coroutines_core = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol8);
                symbol9 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                if (andSetState$kotlinx_coroutines_core == symbol9) {
                    return 5;
                }
                channelSegment.onCancelledRequest(i, true);
                return 5;
            }
        }
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core2 != null) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                if (state$kotlinx_coroutines_core2 != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                    if (state$kotlinx_coroutines_core2 != symbol3) {
                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                        if (state$kotlinx_coroutines_core2 == symbol4) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            return 5;
                        }
                        if (state$kotlinx_coroutines_core2 == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            bufferedChannel.isClosedForSend();
                            return 4;
                        }
                        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.channels.WaiterEB)) {
                            throw new java.lang.AssertionError();
                        }
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        if (state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.channels.WaiterEB) {
                            state$kotlinx_coroutines_core2 = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core2).Camera2StreamConfigurationMap;
                        }
                        if (bufferedChannel.getHighSpeedVideoFpsRanges(state$kotlinx_coroutines_core2, obj)) {
                            symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                            channelSegment.setState$kotlinx_coroutines_core(i, symbol7);
                            bufferedChannel.onReceiveDequeued();
                            return 0;
                        }
                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                        java.lang.Object andSetState$kotlinx_coroutines_core2 = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol5);
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                        if (andSetState$kotlinx_coroutines_core2 == symbol6) {
                            return 5;
                        }
                        channelSegment.onCancelledRequest(i, true);
                        return 5;
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferedChannel.getHighSpeedVideoSizes(j) || z) {
                if (z) {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, symbol)) {
                        channelSegment.onCancelledRequest(i, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    public static final /* synthetic */ void access$registerSelectForReceive(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(bufferedChannel);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment Camera2StreamConfigurationMap2 = bufferedChannel.Camera2StreamConfigurationMap(j, channelSegment);
                if (Camera2StreamConfigurationMap2 != null) {
                    channelSegment = Camera2StreamConfigurationMap2;
                } else {
                    continue;
                }
            }
            java.lang.Object highSpeedVideoFpsRangesFor = bufferedChannel.getHighSpeedVideoFpsRangesFor(channelSegment, i, andIncrement, selectInstance);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
            if (highSpeedVideoFpsRangesFor != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                if (highSpeedVideoFpsRangesFor != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                    if (highSpeedVideoFpsRangesFor == symbol3) {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                    channelSegment.cleanPrev();
                    selectInstance.selectInRegistrationPhase(highSpeedVideoFpsRangesFor);
                    return;
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                kotlinx.coroutines.Waiter waiter = selectInstance instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) selectInstance : null;
                if (waiter != null) {
                    access$prepareReceiverForSuspension(bufferedChannel, waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        selectInstance.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final boolean getHighSpeedVideoSizes(long j) {
        return j < getHighSpeedVideoFpsRanges.get(this) || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.getOutputMinFrameDuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        r1 = (kotlinx.coroutines.channels.ChannelSegment) r1.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlinx.coroutines.channels.ChannelSegment<E> getHighResolutionOutputSizeshNQ4ISI(long j) {
        kotlinx.coroutines.internal.Symbol symbol;
        long j2;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.lang.Object obj = getHighResolutionOutputSizeshNQ4ISI.get(this);
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
        if (channelSegment.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
        if (channelSegment2.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.ConcurrentLinkedListKt.close((kotlinx.coroutines.internal.ConcurrentLinkedListNode) obj);
        if (isConflatedDropOldest()) {
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment4 = channelSegment3;
            loop0: do {
                int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1;
                while (true) {
                    if (i < 0) {
                        break;
                    }
                    j2 = (channelSegment4.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i;
                    if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                        break loop0;
                    }
                    while (true) {
                        java.lang.Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i);
                        if (state$kotlinx_coroutines_core != null) {
                            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                            if (state$kotlinx_coroutines_core != symbol2) {
                                if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                                    break loop0;
                                }
                            }
                        }
                        if (channelSegment4.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment4.onSlotCleaned();
                            break;
                        }
                    }
                    i--;
                }
            } while (channelSegment4 != null);
            j2 = -1;
            if (j2 != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(j2);
            }
        }
        java.lang.Object m24111constructorimpl$default = kotlinx.coroutines.internal.InlineList.m24111constructorimpl$default(null, 1, null);
        loop3: for (kotlinx.coroutines.channels.ChannelSegment<E> channelSegment5 = channelSegment3; channelSegment5 != null; channelSegment5 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment5.getPrev()) {
            for (int i2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1; i2 >= 0; i2--) {
                if ((channelSegment5.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core2 = channelSegment5.getState$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core2 != null) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                        if (state$kotlinx_coroutines_core2 != symbol) {
                            if (state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.channels.WaiterEB) {
                                if (channelSegment5.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m24111constructorimpl$default = kotlinx.coroutines.internal.InlineList.m24116plusFjFbRPM(m24111constructorimpl$default, ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core2).Camera2StreamConfigurationMap);
                                    channelSegment5.onCancelledRequest(i2, true);
                                    break;
                                }
                            } else {
                                if (!(state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.Waiter)) {
                                    break;
                                }
                                if (channelSegment5.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m24111constructorimpl$default = kotlinx.coroutines.internal.InlineList.m24116plusFjFbRPM(m24111constructorimpl$default, state$kotlinx_coroutines_core2);
                                    channelSegment5.onCancelledRequest(i2, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (channelSegment5.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                        channelSegment5.onSlotCleaned();
                        break;
                    }
                }
            }
        }
        if (m24111constructorimpl$default != null) {
            if (!(m24111constructorimpl$default instanceof java.util.ArrayList)) {
                getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.Waiter) m24111constructorimpl$default, true);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(m24111constructorimpl$default, "");
                java.util.ArrayList arrayList = (java.util.ArrayList) m24111constructorimpl$default;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.Waiter) arrayList.get(size), true);
                }
            }
        }
        return channelSegment3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c5, code lost:
    
        getHighSpeedVideoFpsRanges(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges() {
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
        java.lang.Object findSegmentInternal;
        long j = getHighSpeedVideoFpsRanges.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getHighResolutionOutputSizeshNQ4ISI.get(this);
        loop0: while (true) {
            long andIncrement = getHighSpeedVideoFpsRanges.getAndIncrement(this);
            long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (getSendersCounter$kotlinx_coroutines_core() > andIncrement) {
                if (channelSegment.id != j2) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
                    while (true) {
                        findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j2, function2);
                        if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                            break;
                        }
                        kotlinx.coroutines.internal.Segment m24124getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
                        while (true) {
                            kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                            if (segment.id >= m24124getSegmentimpl.id) {
                                break;
                            }
                            if (m24124getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m24124getSegmentimpl)) {
                                    if (segment.decPointers$kotlinx_coroutines_core()) {
                                        segment.remove();
                                    }
                                } else if (m24124getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                    m24124getSegmentimpl.remove();
                                }
                            }
                        }
                    }
                    kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = null;
                    if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                        isClosedForSend();
                        getHighSpeedVideoFpsRangesFor(j2, channelSegment);
                        getHighSpeedVideoFpsRanges(1L);
                    } else {
                        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
                        if (channelSegment3.id > j2) {
                            if (!getHighSpeedVideoFpsRanges.compareAndSet(this, andIncrement + 1, channelSegment3.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE)) {
                                getHighSpeedVideoFpsRanges(1L);
                            } else {
                                getHighSpeedVideoFpsRanges((channelSegment3.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) - andIncrement);
                            }
                        } else {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && channelSegment3.id != j2) {
                                throw new java.lang.AssertionError();
                            }
                            channelSegment2 = channelSegment3;
                        }
                    }
                    if (channelSegment2 != null) {
                        channelSegment = channelSegment2;
                    } else {
                        continue;
                    }
                }
                int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                java.lang.Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && andIncrement >= getInputSizeshNQ4ISI.get(this)) {
                    symbol9 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol9)) {
                        if (!getHighSpeedVideoFpsRangesFor(state$kotlinx_coroutines_core, channelSegment, i)) {
                            symbol10 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                            channelSegment.setState$kotlinx_coroutines_core(i, symbol10);
                            channelSegment.onCancelledRequest(i, false);
                            getHighSpeedVideoFpsRanges(1L);
                        } else {
                            channelSegment.setState$kotlinx_coroutines_core(i, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                            break;
                        }
                    }
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (!(state$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.Waiter)) {
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                        if (state$kotlinx_coroutines_core2 != symbol3) {
                            if (state$kotlinx_coroutines_core2 == null) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, symbol4)) {
                                    break loop0;
                                }
                            } else {
                                if (state$kotlinx_coroutines_core2 == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                                    break loop0;
                                }
                                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                                if (state$kotlinx_coroutines_core2 == symbol5) {
                                    break loop0;
                                }
                                symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                                if (state$kotlinx_coroutines_core2 == symbol6) {
                                    break loop0;
                                }
                                symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                                if (state$kotlinx_coroutines_core2 == symbol7 || state$kotlinx_coroutines_core2 == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                                    break loop0;
                                }
                                symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizes;
                                if (state$kotlinx_coroutines_core2 != symbol8) {
                                    throw new java.lang.IllegalStateException("Unexpected cell state: ".concat(java.lang.String.valueOf(state$kotlinx_coroutines_core2)).toString());
                                }
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement >= getInputSizeshNQ4ISI.get(this)) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, symbol)) {
                            if (!getHighSpeedVideoFpsRangesFor(state$kotlinx_coroutines_core2, channelSegment, i)) {
                                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                                channelSegment.setState$kotlinx_coroutines_core(i, symbol2);
                                channelSegment.onCancelledRequest(i, false);
                            } else {
                                channelSegment.setState$kotlinx_coroutines_core(i, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                                break;
                            }
                        }
                    } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, new kotlinx.coroutines.channels.WaiterEB((kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core2))) {
                        break loop0;
                    }
                }
                getHighSpeedVideoFpsRanges(1L);
            } else {
                if (channelSegment.id < j2 && channelSegment.getNext() != 0) {
                    getHighSpeedVideoFpsRangesFor(j2, channelSegment);
                }
                getHighSpeedVideoFpsRanges(1L);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.ChannelSegment<E> Camera2StreamConfigurationMap(long j, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizesFor;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                break;
            }
            kotlinx.coroutines.internal.Segment m24124getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            while (true) {
                kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m24124getSegmentimpl.id) {
                    break loop0;
                }
                if (m24124getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m24124getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m24124getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m24124getSegmentimpl.remove();
                    }
                }
            }
        }
        if (!kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRanges;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j2 != 0 && j2 != Long.MAX_VALUE && j <= atomicLongFieldUpdater.get(this) / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = getHighResolutionOutputSizeshNQ4ISI;
                while (true) {
                    kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater2.get(this);
                    kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3 = channelSegment2;
                    if (segment2.id >= channelSegment3.id || !channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment3)) {
                        if (segment2.decPointers$kotlinx_coroutines_core()) {
                            segment2.remove();
                        }
                    } else if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                        channelSegment3.remove();
                    }
                }
            }
            if (channelSegment2.id > j) {
                Camera2StreamConfigurationMap(channelSegment2.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return null;
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment2.id == j) {
                return channelSegment2;
            }
            throw new java.lang.AssertionError();
        }
        isClosedForSend();
        if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    private final void getHighSpeedVideoFpsRanges(long j) {
        if ((getHighSpeedVideoFpsRangesFor.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((getHighSpeedVideoFpsRangesFor.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void Camera2StreamConfigurationMap(long j) {
        long j2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getInputSizeshNQ4ISI;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!getInputSizeshNQ4ISI.compareAndSet(this, j2, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2;
        long j = getHighSpeedVideoFpsRanges.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            java.lang.Object obj = getHighResolutionOutputSizeshNQ4ISI.get(this);
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDurationlomOqCM;
            if (obj != channelSegment) {
                throw new java.lang.IllegalStateException("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: ".concat(java.lang.String.valueOf(this)).toString());
            }
        } else if (((kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this)).id > ((kotlinx.coroutines.channels.ChannelSegment) getHighResolutionOutputSizeshNQ4ISI.get(this)).id) {
            throw new java.lang.IllegalStateException("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: ".concat(java.lang.String.valueOf(this)).toString());
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{getHighSpeedVideoSizesFor.get(this), getInputFormats.get(this), getHighResolutionOutputSizeshNQ4ISI.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) obj2;
            channelSegment2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDurationlomOqCM;
            if (channelSegment3 != channelSegment2) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j3 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next;
        if (channelSegment4.getPrev() != 0) {
            throw new java.lang.IllegalStateException("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: ".concat(java.lang.String.valueOf(this)).toString());
        }
        while (channelSegment4.getNext() != 0) {
            S next3 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next3);
            if (((kotlinx.coroutines.channels.ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment4.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next4);
                if (((kotlinx.coroutines.channels.ChannelSegment) next4).getPrev() != channelSegment4) {
                    throw new java.lang.IllegalStateException("The `segment.next.prev === segment` invariant is violated.\nChannel state: ".concat(java.lang.String.valueOf(this)).toString());
                }
            }
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i3);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected segment cell state: ");
                                    sb.append(state$kotlinx_coroutines_core);
                                    sb.append(".\nChannel state: ");
                                    sb.append(this);
                                    throw new java.lang.IllegalStateException(sb.toString().toString());
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
            if (i2 == kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE && channelSegment4 != getHighSpeedVideoSizesFor.get(this) && channelSegment4 != getInputFormats.get(this) && channelSegment4 != getHighResolutionOutputSizeshNQ4ISI.get(this)) {
                throw new java.lang.IllegalStateException("Logically removed segment is reachable.\nChannel state: ".concat(java.lang.String.valueOf(this)).toString());
            }
            S next5 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next5);
            channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next5;
        }
    }

    protected boolean closeOrCancelImpl(java.lang.Throwable cause, boolean cancel) {
        kotlinx.coroutines.internal.Symbol symbol;
        long j;
        long access$constructSendersAndCloseStatus;
        java.lang.Object obj;
        long j2;
        long j3;
        if (cancel) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getOutputFormats;
            do {
                j3 = atomicLongFieldUpdater.get(this);
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(j3 & 1152921504606846975L, 1)));
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizes;
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.getInputFormats;
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol, cause);
        if (cancel) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = getOutputFormats;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(j2 & 1152921504606846975L, 3)));
        } else {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3 = getOutputFormats;
            do {
                j = atomicLongFieldUpdater3.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    access$constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    access$constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(j & 1152921504606846975L, 3);
                }
            } while (!atomicLongFieldUpdater3.compareAndSet(this, j, access$constructSendersAndCloseStatus));
        }
        isClosedForSend();
        onClosedIdempotent();
        if (m) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Camera2StreamConfigurationMap;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
            } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, obj, obj == null ? kotlinx.coroutines.channels.BufferedChannelKt.Camera2StreamConfigurationMap : kotlinx.coroutines.channels.BufferedChannelKt.getHighResolutionOutputSizeshNQ4ISI));
            if (obj != null) {
                ((kotlin.jvm.functions.Function1) obj).invoke(getCloseCause());
            }
        }
        return m;
    }

    protected final java.lang.Throwable getCloseCause() {
        return (java.lang.Throwable) getHighSpeedVideoSizes.get(this);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return getInputSizeshNQ4ISI.get(this);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return getOutputFormats.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizesFor;
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            long j = receiversCounter$kotlinx_coroutines_core / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (channelSegment.id == j || (channelSegment = Camera2StreamConfigurationMap(j, channelSegment)) != null) {
                channelSegment.cleanPrev();
                int i = (int) (receiversCounter$kotlinx_coroutines_core % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                        if (state$kotlinx_coroutines_core != symbol2) {
                            if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                                return true;
                            }
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
                            if (state$kotlinx_coroutines_core != symbol3 && state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                                if (state$kotlinx_coroutines_core != symbol4) {
                                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                                    if (state$kotlinx_coroutines_core != symbol5) {
                                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                                        if (state$kotlinx_coroutines_core == symbol6) {
                                            return true;
                                        }
                                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizes;
                                        if (state$kotlinx_coroutines_core != symbol7 && receiversCounter$kotlinx_coroutines_core == getReceiversCounter$kotlinx_coroutines_core()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDurationlomOqCM;
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                        getHighSpeedVideoFpsRanges();
                        break;
                    }
                }
                getInputSizeshNQ4ISI.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            } else if (((kotlinx.coroutines.channels.ChannelSegment) atomicReferenceFieldUpdater.get(this)).id < j) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Camera2StreamConfigurationMap;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, handler)) {
            return;
        }
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.Camera2StreamConfigurationMap;
            if (obj != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighResolutionOutputSizeshNQ4ISI;
                if (obj != symbol2) {
                    throw new java.lang.IllegalStateException("Another handler is already registered: ".concat(java.lang.String.valueOf(obj)).toString());
                }
                throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked".toString());
            }
            atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.Camera2StreamConfigurationMap;
            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getHighResolutionOutputSizeshNQ4ISI;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        handler.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return getHighSpeedVideoFpsRangesFor(getOutputFormats.get(this), true);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return getHighSpeedVideoFpsRangesFor(getOutputFormats.get(this), false);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        if (getHighSpeedVideoFpsRangesFor(getOutputFormats.get(this), false)) {
            return false;
        }
        return !getHighSpeedVideoSizes(r0 & 1152921504606846975L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public java.lang.Object mo24073tryReceivePtdJZtk() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        long j = getInputSizeshNQ4ISI.get(this);
        long j2 = getOutputFormats.get(this);
        if (getHighSpeedVideoFpsRangesFor(j2, true)) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputMinFrameDuration;
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(this);
                long j3 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j3) {
                    kotlinx.coroutines.channels.ChannelSegment Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j3, channelSegment2);
                    if (Camera2StreamConfigurationMap2 != null) {
                        channelSegment = Camera2StreamConfigurationMap2;
                    } else {
                        continue;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(channelSegment, i, andIncrement, symbol);
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
                if (highSpeedVideoFpsRangesFor != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                    if (highSpeedVideoFpsRangesFor != symbol3) {
                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                        if (highSpeedVideoFpsRangesFor == symbol4) {
                            throw new java.lang.IllegalStateException("unexpected".toString());
                        }
                        channelSegment.cleanPrev();
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(highSpeedVideoFpsRangesFor);
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegment.onSlotCleaned();
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
                }
            }
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getCloseCause());
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public java.lang.Object mo9266trySendJP2dKIU(E element) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        if (getHighSpeedVideoFpsRangesFor(getOutputFormats.get(this), false) || !(!getHighSpeedVideoSizes(r0 & 1152921504606846975L))) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getInputSizeshNQ4ISI;
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
            while (true) {
                long andIncrement = getOutputFormats.getAndIncrement(this);
                long j = andIncrement & 1152921504606846975L;
                boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend = access$findSegmentSend(this, j2, channelSegment2);
                    if (access$findSegmentSend != null) {
                        channelSegment = access$findSegmentSend;
                    } else if (access$isClosedForSend0) {
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                int access$updateCellSend = access$updateCellSend(this, channelSegment, i, element, j, symbol, access$isClosedForSend0);
                if (access$updateCellSend == 0) {
                    channelSegment.cleanPrev();
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
                }
                if (access$updateCellSend == 1) {
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
                }
                if (access$updateCellSend == 2) {
                    if (!access$isClosedForSend0) {
                        channelSegment.onSlotCleaned();
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
                    }
                    channelSegment.onSlotCleaned();
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
                }
                if (access$updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (access$updateCellSend == 4) {
                    if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(getSendException());
                }
                if (access$updateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            }
        } else {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        int i;
        long j;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3 = getHighSpeedVideoFpsRanges.get(this);
        if (j3 == 0 || j3 == Long.MAX_VALUE) {
            return;
        }
        while (getHighSpeedVideoFpsRanges.get(this) <= globalIndex) {
        }
        i = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoSizes;
        for (int i2 = 0; i2 < i; i2++) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = getHighSpeedVideoFpsRanges;
            long j4 = atomicLongFieldUpdater2.get(this);
            if (j4 == (4611686018427387903L & getHighSpeedVideoFpsRangesFor.get(this)) && j4 == atomicLongFieldUpdater2.get(this)) {
                return;
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater3 = getHighSpeedVideoFpsRangesFor;
        do {
            j = atomicLongFieldUpdater3.get(this);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j, kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j & 4611686018427387903L, true)));
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater4 = getHighSpeedVideoFpsRanges;
            long j5 = atomicLongFieldUpdater4.get(this);
            atomicLongFieldUpdater = getHighSpeedVideoFpsRangesFor;
            long j6 = atomicLongFieldUpdater.get(this);
            long j7 = j6 & 4611686018427387903L;
            boolean z = (j6 & 4611686018427387904L) != 0;
            if (j5 == j7 && j5 == atomicLongFieldUpdater4.get(this)) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater.compareAndSet(this, j6, kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j7, true));
            }
        }
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j2 & 4611686018427387903L, false)));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
        while (true) {
            long andIncrement = getOutputFormats.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment<E> access$findSegmentSend = access$findSegmentSend(this, j2, channelSegment);
                if (access$findSegmentSend != null) {
                    channelSegment = access$findSegmentSend;
                } else if (access$isClosedForSend0) {
                    java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((kotlinx.coroutines.channels.BufferedChannel<E>) e, continuation);
                    if (Camera2StreamConfigurationMap2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return Camera2StreamConfigurationMap2;
                    }
                }
            }
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i, e, j, null, access$isClosedForSend0);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (access$updateCellSend == 1) {
                break;
            }
            if (access$updateCellSend != 2) {
                if (access$updateCellSend == 3) {
                    java.lang.Object Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(channelSegment, i, e, j, continuation);
                    if (Camera2StreamConfigurationMap3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return Camera2StreamConfigurationMap3;
                    }
                } else if (access$updateCellSend == 4) {
                    if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    java.lang.Object Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap((kotlinx.coroutines.channels.BufferedChannel<E>) e, continuation);
                    if (Camera2StreamConfigurationMap4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return Camera2StreamConfigurationMap4;
                    }
                } else if (access$updateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
            } else if (!access$isClosedForSend0) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    throw new java.lang.AssertionError();
                }
            } else {
                channelSegment.onSlotCleaned();
                java.lang.Object Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap((kotlinx.coroutines.channels.BufferedChannel<E>) e, continuation);
                if (Camera2StreamConfigurationMap5 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Camera2StreamConfigurationMap5;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) getHighSpeedVideoSizesFor.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getInputSizeshNQ4ISI.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment<E> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j, channelSegment);
                if (Camera2StreamConfigurationMap2 != null) {
                    channelSegment = Camera2StreamConfigurationMap2;
                } else {
                    continue;
                }
            }
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(channelSegment, i, andIncrement, (java.lang.Object) null);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.getOutputStallDuration;
            if (highSpeedVideoFpsRangesFor != symbol) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRanges;
                if (highSpeedVideoFpsRangesFor != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.isOutputSupportedForhNQ4ISI;
                    if (highSpeedVideoFpsRangesFor == symbol3) {
                        return getHighSpeedVideoSizes(channelSegment, i, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return highSpeedVideoFpsRangesFor;
                }
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
        }
        kotlinx.coroutines.channels.ClosedReceiveChannelException closeCause = getCloseCause();
        if (closeCause == null) {
            closeCause = new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closeCause);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c8, code lost:
    
        r10 = (kotlinx.coroutines.channels.ChannelSegment) r10.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getHighSpeedVideoFpsRangesFor(long j, boolean z) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            getHighResolutionOutputSizeshNQ4ISI(j & 1152921504606846975L);
            return (z && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i != 3) {
            throw new java.lang.IllegalStateException("unexpected close status: ".concat(java.lang.String.valueOf(i)).toString());
        }
        kotlinx.coroutines.channels.ChannelSegment<E> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(j & 1152921504606846975L);
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException = null;
        java.lang.Object m24111constructorimpl$default = kotlinx.coroutines.internal.InlineList.m24111constructorimpl$default(null, 1, null);
        loop0: do {
            int i2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                long j2 = (highResolutionOutputSizeshNQ4ISI.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i2;
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = highResolutionOutputSizeshNQ4ISI.getState$kotlinx_coroutines_core(i2);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.getHighSpeedVideoFpsRangesFor;
                    if (state$kotlinx_coroutines_core == symbol) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputFormats;
                        if (state$kotlinx_coroutines_core == symbol2 || state$kotlinx_coroutines_core == null) {
                            if (highResolutionOutputSizeshNQ4ISI.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                highResolutionOutputSizeshNQ4ISI.onSlotCleaned();
                                break;
                            }
                        } else if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                            if (state$kotlinx_coroutines_core == symbol3) {
                                break loop0;
                            }
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizes;
                            if (state$kotlinx_coroutines_core == symbol4) {
                                break loop0;
                            }
                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.getOutputSizeshNQ4ISI;
                            if (state$kotlinx_coroutines_core != symbol5) {
                                break;
                            }
                        } else {
                            if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            kotlinx.coroutines.Waiter waiter = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB ? ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).Camera2StreamConfigurationMap : (kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core;
                            if (highResolutionOutputSizeshNQ4ISI.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (function1 != null) {
                                    undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, highResolutionOutputSizeshNQ4ISI.getElement$kotlinx_coroutines_core(i2), undeliveredElementException);
                                }
                                m24111constructorimpl$default = kotlinx.coroutines.internal.InlineList.m24116plusFjFbRPM(m24111constructorimpl$default, waiter);
                                highResolutionOutputSizeshNQ4ISI.cleanElement$kotlinx_coroutines_core(i2);
                                highResolutionOutputSizeshNQ4ISI.onSlotCleaned();
                            }
                        }
                    } else {
                        if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (highResolutionOutputSizeshNQ4ISI.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (function1 != null) {
                                undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, highResolutionOutputSizeshNQ4ISI.getElement$kotlinx_coroutines_core(i2), undeliveredElementException);
                            }
                            highResolutionOutputSizeshNQ4ISI.cleanElement$kotlinx_coroutines_core(i2);
                            highResolutionOutputSizeshNQ4ISI.onSlotCleaned();
                        }
                    }
                }
                i2--;
            }
        } while (highResolutionOutputSizeshNQ4ISI != null);
        if (m24111constructorimpl$default != null) {
            if (!(m24111constructorimpl$default instanceof java.util.ArrayList)) {
                getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.Waiter) m24111constructorimpl$default, false);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(m24111constructorimpl$default, "");
                java.util.ArrayList arrayList = (java.util.ArrayList) m24111constructorimpl$default;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.Waiter) arrayList.get(size), false);
                }
            }
        }
        if (undeliveredElementException == null) {
            return true;
        }
        throw undeliveredElementException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r11.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (this.onUndeliveredElement != null) {
            throw new java.lang.IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
        }
        kotlinx.coroutines.channels.BufferedChannel.SendBroadcast sendBroadcast = new kotlinx.coroutines.channels.BufferedChannel.SendBroadcast(cancellableContinuationImpl2);
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) getInputFormats.get(this);
        while (true) {
            long andIncrement = getOutputFormats.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean access$isClosedForSend0 = access$isClosedForSend0(this, andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend = access$findSegmentSend(this, j2, channelSegment2);
                if (access$findSegmentSend != null) {
                    channelSegment = access$findSegmentSend;
                } else if (access$isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = channelSegment;
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i, e, j, sendBroadcast, access$isClosedForSend0);
            if (access$updateCellSend == 0) {
                channelSegment3.cleanPrev();
                break;
            }
            if (access$updateCellSend == 1) {
                break;
            }
            if (access$updateCellSend != 2) {
                if (access$updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (access$updateCellSend != 4) {
                    if (access$updateCellSend == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment3.cleanPrev();
                }
            } else if (access$isClosedForSend0) {
                channelSegment3.onSlotCleaned();
            } else {
                access$prepareSenderForSuspension(this, sendBroadcast, channelSegment3, i);
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo24072receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        return getHighSpeedVideoSizes(this, continuation);
    }
}
